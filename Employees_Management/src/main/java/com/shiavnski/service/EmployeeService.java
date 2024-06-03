package com.shiavnski.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.shiavnski.entities.Employee;
import com.shiavnski.repositories.EmployeeRepository;

@Service
public class EmployeeService{

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
		public Employee saveEmployee(Employee employee) {
			employee.setEmployeePassword(passwordEncoder.encode(employee.getEmployeePassword()));
			Employee employeee = employeeRepository.save(employee);
			return employeee ;
		}
		
		public List<Employee> getAllEmployees(){
			return (List<Employee>) employeeRepository.findAll();
		}
		
		public Optional<Employee> getEmployeeById(int id){
			return employeeRepository.findById(id);
		}
		
		public Employee updateBook(Employee employee,int employeeId) {
			employee.setEmployeePassword(passwordEncoder.encode(employee.getEmployeePassword()));
			return employeeRepository.save(employee);
		}
		
		public void deleteEmployee(int employeeId) {
			employeeRepository.deleteById(employeeId);
		}

}
