package com.amr.Springdemo.service;


import com.amr.Springdemo.DTO.EmployeeDTO;
import com.amr.Springdemo.entity.employeeEntity;
import com.amr.Springdemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Employeeservice {

    @Autowired
    EmployeeRepository employeeRepository;
    public EmployeeDTO getEmployee(Integer id)
    {
       employeeEntity employeeE=employeeRepository.getEmployee(id);
       EmployeeDTO employeeDTO=new EmployeeDTO();
       return employeeDTO.EmployeeMapper(employeeE);

    }
}
