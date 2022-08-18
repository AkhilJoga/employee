package com.empmicro.entity;


public class Record {
	
	
	private long cid;
	private String email;
	private String comapnayName;
	private long eid;
	
	
	public Record(long cid, String email, String comapnayName, long eid) {
		super();
		this.cid = cid;
		this.email = email;
		this.comapnayName = comapnayName;
		this.eid = eid;
	}
	
	
	public long getCid() {
		return cid;
	}
	public String getEmail() {
		return email;
	}
	public String getComapnayName() {
		return comapnayName;
	}
	public long getEid() {
		return eid;
	}
	public void setCid(long cid) {
		this.cid = cid;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setComapnayName(String comapnayName) {
		this.comapnayName = comapnayName;
	}
	public void setEid(long eid) {
		this.eid = eid;
	}
	
	

}
