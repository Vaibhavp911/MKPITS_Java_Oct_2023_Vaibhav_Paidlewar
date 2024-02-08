package com.mkpits.exceptions;

public class TryCatch {

	public static void main(String[] args) {
		
		int divident = 9 ;
		int divisor = 0;
		
		// compile time error example
		try {
		System.out.println(divident/divisor);
		}
		//	catch( Exception_Name obj_of_that_exception_class)
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("Exception Occurred");
	}

}
