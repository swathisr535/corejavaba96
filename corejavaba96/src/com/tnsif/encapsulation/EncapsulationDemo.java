package com.tnsif.encapsulation;

public class EncapsulationDemo {
	
	public static void main(String[] args) {
		
		Encapsulation ob = new Encapsulation();
//		ob.serialNum=70;
//		ob.name="veena";
//		ob.age=20;
//	    ob.show();
		
		ob.setserialNum(50);
		ob.setname("sagar");
		ob.setage(23);
		
		ob.getserialNum();
		ob.getname();
		ob.getage();
		
		System.out.println(ob);
		
	}

}
