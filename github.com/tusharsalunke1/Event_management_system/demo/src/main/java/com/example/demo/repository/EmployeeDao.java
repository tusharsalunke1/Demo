package com.example.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

@Repository
public class EmployeeDao {

		@PersistenceContext
		private EntityManager entityManager;
		
		public List<Employee> findAll() {
			Query q = entityManager.createQuery("select e from Employee e");
			List<Employee> list = q.getResultList();
			return list;
		}	
	
		@Transactional
		public void save(Employee employee) {
			entityManager.persist(employee);
				
	
		}
}
