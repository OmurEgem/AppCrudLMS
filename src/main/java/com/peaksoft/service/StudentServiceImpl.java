package com.peaksoft.service;

import com.peaksoft.dao.StudentDao;
import com.peaksoft.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServiceImpl implements StudentService {


    private StudentDao studentDao;
    @Autowired
    public StudentServiceImpl(@Qualifier("studentDaoImpl") StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public StudentServiceImpl() {

    }

    @Override
    public Student saveStudent(Student student) {
        studentDao.saveStudent(student);
        return student;
    }

    @Override
    public void studentUpdate(long id, Student student) {

    }

    @Override
    public void deleteById(long id) {
        studentDao.deleteById(id);
    }

    @Override
    public Student getById(long id) {
        return studentDao.getById(id);
    }

    @Override
    public void deleteAll(Student student) {

    }

    @Override
    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }
}
