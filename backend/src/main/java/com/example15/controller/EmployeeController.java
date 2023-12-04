package com.example15.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example15.DTO.EmployeeDTO;
import com.example15.service.EmployeeService;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/employee")
public class EmployeeController
{
	   @Autowired
       private EmployeeService employeeService;
	   
       @PostMapping("/save")
       public String saveEmployee(@RequestBody EmployeeDTO employeeDTO)
       {
        String id= employeeService.addEmployee(employeeDTO);
        return id;
       }
}
