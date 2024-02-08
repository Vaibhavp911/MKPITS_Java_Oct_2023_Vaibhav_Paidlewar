package com.mkpits.constructers;

public class Parameterised_Contructer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parameterised_Contructer p = new Parameterised_Contructer();
		Parameterised_Contructer p1 = new Parameterised_Contructer(69);
	}
	// Constructor method don't have any return type and static/ non-static
	public Parameterised_Contructer() {
		System.out.println("Parameterised constructer called with no argument: ");
	}
	
	public Parameterised_Contructer(int a) {
		System.out.println("Parameterised constructer called with argument: ");
		System.out.println(a);
	}

}
