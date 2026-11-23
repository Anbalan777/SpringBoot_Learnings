package com.amr.Springdemo.DTO;

import com.amr.Springdemo.entity.employeeEntity;
import lombok.Data;

@Data
public class EmployeeDTO {

    private String name;
    private String dept;
    private Integer age;

    public EmployeeDTO EmployeeMapper(employeeEntity emp) {
        this.name = emp.getName();
        this.dept = emp.getDept();
        this.age = emp.getAge();

        return this;
    }
}