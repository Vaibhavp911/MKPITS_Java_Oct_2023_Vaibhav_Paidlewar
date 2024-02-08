package com.mkpits.operators;

public class Error_Assignment {
	// Java program to Illustrate Increment and Decrement
	// operators Can be applied to variables only

	// Main class

	// main driver method
		public static void main(String[] args)
		{
			// Declaring and initializing variable
			int a = 10;

			int b = ++a;

			// This is change made in above program
			// which reflects error during compilation
		//	b = 10 ++;

			// Printing its value
			System.out.println(b);
		}
}
