package com.amr.Springdemo.controller;


import com.amr.Springdemo.DTO.EmployeeDTO;
import com.amr.Springdemo.service.Employeeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    Employeeservice employeeservice;

    @GetMapping("/getEmployee/{id}")
    public ResponseEntity<EmployeeDTO> getEmployee(@PathVariable Integer id)
    {
       EmployeeDTO employee= employeeservice.getEmployee(id);
       return ResponseEntity.ok(employee);
    }
}
