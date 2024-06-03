package com.shiavnski.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shiavnski.entities.Department;
import com.shiavnski.repositories.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	DepartmentRepository departmentRepository;
	
			public Department saveDepartment(Department department) {
				Department department1 = departmentRepository.save(department);
				return department1 ;
			}
			
			public List<Department> getAllDepartments(){
				return (List<Department>) departmentRepository.findAll();
			}
			
			public Optional<Department> getDepartmentById(int id){
				return departmentRepository.findById(id);
			}
			
			public Department updateDepartment(Department department,int departmentId) {
				return departmentRepository.save(department);
			}
			
			public void deleteDepartment(int departmentId) {
				departmentRepository.deleteById(departmentId);
}
}
