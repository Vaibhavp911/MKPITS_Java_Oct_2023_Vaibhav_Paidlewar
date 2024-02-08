package com.mkpits.operators;

public class Assignment_Arithmatic_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_Arithmatic_Operators oP = new Assignment_Arithmatic_Operators();
		oP.getA1lddition();
		oP.getSubtraction();
		oP.getMultiplication();
		oP.getDivision();
		oP.getModulus();
	}

	public void getA1lddition() {
		int a = 3;
		int b = 55;
		a=+b; //assignment operator
		System.out.println("value of 'a' is updated with addition of 'b' : "+a);
		System.out.println("-----------------------------------------------------------------------------------------------");
	}
	
	public void getSubtraction() {
		int a = 746;
		int b = 645376;
		b=-a;
		System.out.println("Value of 'b' is updated with subtraction operation as 'b-a' : "+b);
		System.out.println("-----------------------------------------------------------------------------------------------");

	}
	
	public void getMultiplication() {
		int a  = 25;
		int b = 92843;
		a*=b;
		System.out.println("Value of 'a' is updated as multiplication operation has been performed as 'a=a*b': "+a);
		System.out.println("------------------------------------------------------------------------------------------------");

	}
	
	public void getDivision() {
		float a = 53;
		float b = 36;
		a/=b;
		System.out.println("Value of 'a' is updated as division operation has been performed as 'a=a/b': "+a);
		System.out.println("------------------------------------------------------------------------------------------------");
	}
	
	public void getModulus() {
		float a = 53;
		float b = 36;
		a%=b;
		System.out.println("Value of 'a' is updated as Modulus operation has been performed as 'a=a%b': "+a);
		System.out.println("------------------------------------------------------------------------------------------------");

	}
	
	public void getFinalOperatorsResult() {
		
	}
}
