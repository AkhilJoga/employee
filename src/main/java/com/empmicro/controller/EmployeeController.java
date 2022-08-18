package com.empmicro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empmicro.entity.Employee;
import com.empmicro.services.IEmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	private IEmployeeService iEmployeeService;
	
	@GetMapping("/{eid}")
	public Employee getEmployee(@PathVariable("eid") Long eid) {
		return iEmployeeService.getEmployee(eid);
	}
	
}
