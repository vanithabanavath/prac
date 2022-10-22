package com.chandra.springrest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chandra.springrest.entity.Employee;
import com.chandra.springrest.repo.EmployeeRepo;

@RestController
public class EmployeeRest {
	
	@Autowired
	EmployeeRepo repo;
	
	@RequestMapping(value="/employees/",method=RequestMethod.GET)
	public List<Employee> getEmployees(){
		return repo.findAll();
		
	}
	@RequestMapping(value="/employees/{id}",method=RequestMethod.GET)
	public Employee getEmployee(@PathVariable("id") int id) {
		return repo.findById(id).get();
	}
	
	@RequestMapping(value="/employees/",method=RequestMethod.POST)
	public Employee createEmployee(Employee employee){
		return repo.save(employee);

}
