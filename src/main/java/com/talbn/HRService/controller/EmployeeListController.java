package com.talbn.HRService.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.talbn.HRService.data.EmployeeDaoRepository;
import com.talbn.HRService.model.*;

@RestController

public class EmployeeListController {

	EmployeeDaoRepository mongoDaoRepository;

	public EmployeeListController(EmployeeDaoRepository mongoDaoRepository) {
		this.mongoDaoRepository = mongoDaoRepository;
	}

	@GetMapping("/employees")
	public List<Employee> loadAllEmployees() {
		List<Employee> emplist = null;
		try {
			emplist = mongoDaoRepository.findAll();
			System.out.println(emplist.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return emplist;
	}

	@GetMapping("/employee/{employeeId}")
	public Employee getEmployee(@PathVariable("employeeId") String employeeId) {
		Employee emp = null;
		try { 
			emp =mongoDaoRepository.findByEmployeeId(employeeId);
		} catch (Exception e) {
			e.printStackTrace(); 
			} 
		return emp; 
	}

	@PostMapping
	public void insert(@RequestBody Employee employee) {
		this.mongoDaoRepository.insert(employee);
	}

	@PutMapping
	public void update(@RequestBody Employee employee) {
		this.mongoDaoRepository.save(employee);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id) {
		this.mongoDaoRepository.deleteById(id);
	}

}
