package com.elrich.java.core;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myString = "This is a String";
		System.out.println("myString is equal to " + myString);
		myString = myString + ", and this is more.";
		System.out.println("myString is equal to " + myString);
		myString = myString + " \u00A9 2019";
		System.out.println("myString is equal to " + myString);
		String numberString = "250.55";
		numberString = numberString + "49.95";
		System.out.println(numberString); 
		String lastString = "10";
		int myInt = 50;
		lastString = lastString + myInt;
		System.out.print("Last String is equal to " + lastString);
		double doubleNumber = 120.47d;
		lastString = lastString + doubleNumber;
		System.out.println("Last String is equal to " + lastString);
	}

}
