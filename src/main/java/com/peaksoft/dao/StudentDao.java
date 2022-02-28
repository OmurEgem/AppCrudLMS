package com.peaksoft.dao;

import com.peaksoft.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentDao  {
    //добавить
    Student  saveStudent(Student student);
    //Изменить
    void studentUpdate(long id,Student student);

    //Удалить по id
    void deleteById(long id);

    //Найти по id
    Student getById(long id);


    //Удалить всех
    void deleteAll(Student student);

    //Вытащить всех
    List<Student> getAllStudents();
}
