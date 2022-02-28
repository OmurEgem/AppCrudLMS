package com.peaksoft.service;

import com.peaksoft.model.Company;
import com.peaksoft.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CompanyServiceImpl implements CompanyService{

    @Override
    public void saveCompany(Company company) {

    }

    @Override
    public void updateCompany(long id) {

    }

    @Override
    public void deleteByIdCompany(long id) {

    }

    @Override
    public Student getByIdCompany(long id) {
        return null;
    }

    @Override
    public void deleteAllCompany(Company company) {

    }

    @Override
    public List<Company> getAllCompanies() {
        return null;
    }
}
