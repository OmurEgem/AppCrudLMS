package com.peaksoft.dao;

import com.peaksoft.model.Company;
import com.peaksoft.model.Group;
import com.peaksoft.model.Student;

import java.util.List;

public interface GroupDao {
    void  saveGroup(Group group);

    void updateGroup(long id);

    void deleteByIdGroup(long id);

    Student getByIdGroup(long id);

    void deleteAllGroups(Company company);

    List<Company> getAllGroups();
}
