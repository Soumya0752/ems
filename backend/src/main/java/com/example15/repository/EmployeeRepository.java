package com.example15.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example15.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>
{

}
