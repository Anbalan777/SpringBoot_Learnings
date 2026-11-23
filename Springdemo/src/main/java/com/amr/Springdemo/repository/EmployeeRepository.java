package com.amr.Springdemo.repository;

import com.amr.Springdemo.entity.employeeEntity;
import com.amr.Springdemo.service.Employeeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {

    public employeeEntity getEmployee(Integer id) {
        return new employeeEntity(1,"ram","IT",27);
    }
}

