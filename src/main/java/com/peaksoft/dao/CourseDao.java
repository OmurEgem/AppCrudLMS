package com.peaksoft.dao;

import com.peaksoft.model.Company;
import com.peaksoft.model.Course;
import com.peaksoft.model.Student;

import java.util.List;

public interface CourseDao {
    void  saveCourse(Course course);
    //Изменить
    void updateCourse(long id);

    //Удалить по id
    void deleteByIdCourse(long id);

    //Найти по id
    Student getByIdCourse(long id);


    //Удалить всех
    void deleteAllCourses(Company company);

    //Вытащить всех
    List<Company> getAllCourses();
}
