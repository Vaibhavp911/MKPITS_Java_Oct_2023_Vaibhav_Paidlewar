package com.mkpits.exceptions;

public class DefaultHandling {

	public static void main(String[] args) 
	{
		int divident = 9 , divisor = 0;
		
		// compile time error example
		
		System.out.println(divident/divisor);
		
		// Exception in thread "main" java.lang.ArithmeticException: / by zero
		// at com.mkpits.exceptions.DefaultHandling.main(DefaultHandling.java:11)

	}

}
