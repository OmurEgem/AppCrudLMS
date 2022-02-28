package com.peaksoft.dao;

import com.peaksoft.model.Company;
import com.peaksoft.model.Group;
import com.peaksoft.model.Student;

import java.util.List;

public interface TeacherDao {
    void  saveTeacher(Group group);

    void updateTeacher(long id);

    void deleteByIdTeacher(long id);

    Student getByIdTeacher(long id);

    void deleteAllTeachers(Company company);

    List<Company> getAllTeachers();
}
