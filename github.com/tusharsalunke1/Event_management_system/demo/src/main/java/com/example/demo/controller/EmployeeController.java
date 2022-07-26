package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@CrossOrigin
@RestController
public class EmployeeController {
	
	
	@Autowired
	private EmployeeService employeeService; 
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllBookings();
	}
		
//	@GetMapping("/employee1")
//	public String getString(){
//		return "hi";
//	}
	
	@PostMapping("/employee")
	public void insertEmployee(@RequestBody Employee employee) {
		employeeService.createEmp(employee);
	}

}
