package com.mkpits.controlflowstructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial_ForLoop {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		// Factorial_ForLoop fFL = new Factorial_ForLoop();
		BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));

		int fact=1;

		System.out.println("Enter the Value of n for its factorial: ");
		int n = Integer.parseInt(bR.readLine());
		
		for (int i = n; i >=1; i--) {
			fact*=i;
			//System.out.println("Factorial of "+n+" is "+fact);
		}
		System.out.println("Factorial of "+n+" is "+fact);
	}

}
