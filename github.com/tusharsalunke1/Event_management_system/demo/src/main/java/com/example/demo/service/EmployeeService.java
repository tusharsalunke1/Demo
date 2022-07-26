package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeDao;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDao employeeDao;
	

	public List<Employee> getAllBookings() {
		
		return employeeDao.findAll();
	}

	
	public void createEmp(Employee employee) {
		 employeeDao.save(employee);
	}
	

}
