package com.mkpits.constructers;

public class Object_To_Object_TypeCasting {
	int voterId;
	String voterName;

	public static void main(String[] args) {

		// Java automatically generates a default constructor for you.
		// 
		//Object_To_Object_TypeCasting oTo1 = new Object_To_Object_TypeCasting();
		Object_To_Object_TypeCasting oTo2 = new Object_To_Object_TypeCasting(3592824, "Vaibhav Paidlewar");
		// argument passed in above instance
		Object_To_Object_TypeCasting oTo3 = new Object_To_Object_TypeCasting(oTo2);
		

	}
	

	public Object_To_Object_TypeCasting() {
		System.out.println("Default Constructor");
		int voterId = 34523322;
		String voterName = "Gaurav Sharma";
		System.out.println("voterId: "+voterId+", voterName: "+voterName);
		// this constructor will run by default
	}
	
	public Object_To_Object_TypeCasting(int i, String j) {	// constructor with parameter integer and String .
		System.out.println("Contructor With parameter");
		int voterId = i;
		String voterName = j;
		System.out.println("voterId: "+voterId+", voterName: "+voterName);
	}
	
	public Object_To_Object_TypeCasting(Object_To_Object_TypeCasting vaR) {
		System.out.println("Contructor with Object");
		int voterId = vaR.voterId;
		String voterName = vaR.voterName;
		System.out.println("voterId: "+voterId+", voterName: "+voterName);
		
		String aC = new String(vaR.voterName);
		System.out.println(aC);
		
				
	}
}
