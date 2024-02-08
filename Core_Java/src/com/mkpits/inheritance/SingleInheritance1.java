package com.mkpits.inheritance;

import java.io.IOException;

public class SingleInheritance1 {
	int intermidiate;

	public static void main(String[] args) throws IOException
	{
		// Single Inheritance
		// creating object of sub-class to call the superclass1 and subclass1
		// subclass calls super class
		
		SubClass1 sC1 = new SubClass1();
		sC1.getDetails();
	}

}
