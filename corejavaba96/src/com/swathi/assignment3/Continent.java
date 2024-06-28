package com.swathi.assignment3;

public class Continent {
	 String continentName;
	 double size;
	 int noofcountries;
	
	public Continent() {
		super();
	}

	public Continent(String continentName, double size, int noofcountries) {
		super();
		this.continentName = continentName;
		this.size = size;
		this.noofcountries = noofcountries;
	}

	@Override
	public String toString() {
		return "Continent [continentName=" + continentName + ", size=" + size + ", noofcountries=" + noofcountries
				+ "]";
	}
	
	
}
