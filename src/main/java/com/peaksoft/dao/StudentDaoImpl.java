package com.peaksoft.dao;

import com.peaksoft.model.Student;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Repository
public class StudentDaoImpl implements StudentDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Student saveStudent(Student student) {
        entityManager.persist(student);
        return student;
    }

    @Override
    @Transactional
    public void studentUpdate(long id, Student student) {
        Student student1 = getById(id);
        student1.setFirstName(student.getFirstName());
        student1.setLastName(student.getLastName());
        student1.setEmail(student.getEmail());
        student1.setGroup(student.getGroup());
        student1.setStudyFormat(student.getStudyFormat());
        entityManager.merge(student1);
    }

    @Override
    @Transactional
    public void deleteById(long id) {
        entityManager.remove(getById(id));
    }

    @Override
    @Transactional
    public Student getById(long id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    @Transactional
    public void deleteAll(Student student) {
        entityManager.remove(student);
    }

    @Override
    @Transactional
    public List<Student> getAllStudents() {
        return entityManager.createQuery("select s from Student s", Student.class).getResultList();

    }
}