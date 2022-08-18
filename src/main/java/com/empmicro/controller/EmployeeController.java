package com.empmicro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.empmicro.entity.Employee;
import com.empmicro.services.IEmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	private IEmployeeService iEmployeeService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@GetMapping("/{eid}")
	public Employee getEmployee(@PathVariable("eid") Long eid) {
		Employee employee = this.iEmployeeService.getEmployee(eid);
		List records = this.restTemplate.getForObject("http://localhost:8090/records/emp/"+eid, List.class);
		employee.setRecords(records);
		return employee; 
	}
	
}
