package com.inheritanceprog;

public class Student extends Customer {
	private String collageName;
	private int rollno;
	
	public Student() {
		super();
	}

	public Student(String name, int id, long adharNo, long phoneNo,String collageName,int rollno) {
		super(name, id, adharNo, phoneNo);
		this.collageName=collageName;
		this.rollno=rollno;
	}

	public String getCollageName() {
		return collageName;
	}

	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}

	public int getRollNo() {
		return rollno;
	}

	public void setRollNo(int rollNo) {
		this.rollno = rollNo;
	}
	
	@Override
	public String toString() {
		return "Student [collageName=" + collageName + ", rollNo=" + rollno + ", getCollageName()=" + getCollageName()
				+ ", getRollNo()=" + getRollNo() + ", getName()=" + getName() + ", getId()=" + getId()
				+ ", getAdharNo()=" + getAdharNo() + ", getPhoneNo()=" + getPhoneNo() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
}
