package com.empmicro.entity;

import java.util.ArrayList;
import java.util.List;

import com.empmicro.entity.Record;

public class Employee {
	
	
	private Long eid;
	private String name;
	private String phone;
	
	private List<Record> records = new ArrayList<>();
	
	public Employee(Long eid, String name, String phone) {
		super();
		this.eid = eid;
		this.name = name;
		this.phone = phone;
	}
	
	public Employee() {
		super();
	}


	public Employee(Long eid, String name, String phone, List<Record> records) {
		super();
		this.eid = eid;
		this.name = name;
		this.phone = phone;
		this.records = records;
	}

	
	public Long getEid() {
		return eid;
	}
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	public void setEid(Long eid) {
		this.eid = eid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}


	public List<Record> getRecords() {
		return records;
	}


	public void setRecords(List<Record> records) {
		this.records = records;
	}
	
	
	

}
