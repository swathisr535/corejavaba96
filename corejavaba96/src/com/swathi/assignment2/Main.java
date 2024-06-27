package com.swathi.assignment2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student obj = new Student();
		System.out.println(obj);
		Commission ob = new Commission();
		ob.acceptDetails("sagar", "1st main jainagar", 1234567890, 60000);
		double commission = ob.calculateCommission();
		System.out.println("commission: $ " + commission);
	}

}
