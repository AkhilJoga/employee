package com.empmicro.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.empmicro.entity.Employee;

@Service
public class IEmployeeServiceImpl implements IEmployeeService {

	
	List<Employee> empList = List.of(
			new Employee(123456L,"Akhil","789899393939"),
			new Employee(123454L,"David","930390303030"),
			new Employee(234567L,"Parker","83939389399"),
			new Employee(987393L,"Novah","930383949049"),
			new Employee(893030L,"Lehe","18393003030")
			);
		
	
	@Override
	public Employee getEmployee(Long id) {
		// TODO Auto-generated method stub
		return empList.stream().filter(employee -> employee.getEid().equals(id)).findAny().orElse(null);
	}

}
