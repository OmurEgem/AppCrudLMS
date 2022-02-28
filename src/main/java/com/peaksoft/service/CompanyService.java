package com.peaksoft.service;

import com.peaksoft.dao.CompanyDao;
import com.peaksoft.model.Company;
import com.peaksoft.model.Student;

import java.util.List;

public interface CompanyService  {
    //добавить
    void  saveCompany(Company company);
    //Изменить
    void updateCompany(long id);

    //Удалить по id
    void deleteByIdCompany(long id);

    //Найти по id
    Student getByIdCompany(long id);


    //Удалить всех
    void deleteAllCompany(Company company);

    //Вытащить всех
    List<Company> getAllCompanies();
}
