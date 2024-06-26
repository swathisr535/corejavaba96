package com.tnsif.encapsulation;

public class Encapsulation {
	private int serialNum;
	private String name;
	private int age;
	
	public int getserialNum() {
		return serialNum;
	}
	public void setserialNum(int serialNum) {
		this.serialNum = serialNum;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public int getage() {
		return age;
	}
	public void setage(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Encapsulation [serialNum=" + serialNum + ", name=" + name + ", age=" + age + "]";
	}
	
//	void show() {
//		System.out.println("serialnum: "+serialNum+"\t Name: "+name+"\t Age:"+age);
//	}

	
	
	
}
