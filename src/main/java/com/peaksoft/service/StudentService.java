package com.peaksoft.service;

import com.peaksoft.dao.StudentDao;
import com.peaksoft.model.Student;

import java.util.List;

public interface StudentService  {
    //добавить
    Student saveStudent(Student student);
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
