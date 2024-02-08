package com.mkpits.exceptions;

public class MultipleTryCatch {

	public static void main(String[] args)
	{

		int divident = 9 ;
		int divisor = 0;
		
		// compile time error example
		try {
		System.out.println(divident/divisor);
		}
		catch(ArithmeticException e) {
		// catch( Exception_Name obj_of_that_exception_class)
			e.printStackTrace();
		}
		System.out.println("Exception Occurred");
		
		int[] testArray = new int[3];
		try {
			// printing position that does not exits.
			System.out.println(testArray[3]);
		} catch (Exception e) {
		// handle exception
			// Prints this throwable and its back trace to the standard error stream.
			e.printStackTrace();
		}

	}

}
