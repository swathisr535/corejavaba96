package com.swathi.assignment2;

class Student {
	Student(){
		System.out.println("Student object is created");
	}
}

class Commission{
	String Name;
	String Address;
	long Phone;
	double Sales_amount;
	
	
	void acceptDetails(String name,String address,long phone,double sales_amount) {
		Name=name;
		Address=address;
		Phone=phone;
		Sales_amount=sales_amount;
	}
	
	double calculateCommission() {
		 if (Sales_amount >= 100000) {
	            return 0.1 * Sales_amount;
	        } else if (Sales_amount >= 50000 && Sales_amount < 100000) {
	            return 0.05 * Sales_amount;
	        } else if (Sales_amount >= 30000 && Sales_amount < 50000) {
	            return 0.03 * Sales_amount;
	        } else {
	            return 0;
	       }
	}
}

