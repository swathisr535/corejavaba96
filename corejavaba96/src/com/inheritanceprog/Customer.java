package com.inheritanceprog;

public class Customer {
	private String name;
	private int id;
	private long adharNo;
	private long phoneNo;
	
	public Customer() {
		super();
	}
	
	public Customer(String name, int id, long adharNo, long phoneNo) {
		super();
		this.name = name;
		this.id = id;
		this.adharNo = adharNo;
		this.phoneNo = phoneNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + ", adharNo=" + adharNo + ", phoneNo=" + phoneNo + "]";
	}
	
	
	
}
