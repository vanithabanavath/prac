package com.chandra.springrest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chandra.springrest.entity.Employee;


public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
