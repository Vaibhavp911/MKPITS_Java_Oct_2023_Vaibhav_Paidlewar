package com.mkpits.controlflowstructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum_Of_Number_ForLoop {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter value of n");
		int n = Integer.parseInt(reader.readLine());
		int fSum = n;
	// using if-else loop
		System.out.println("------------------------------------------------------------------");
		if (n>0 && n<=1000) 
		{
			// using FOR LooP 
			for (int i = n ; i > 0; --i) 
			{
				fSum += n-i;
			}
				System.out.println("Sum of Numbers from '"+n+"' to '0' is "+fSum);
		} else {
			System.out.println("Re-Runn the code.");
			   }
		System.out.println("------------------------------------------------------------------");
		
	/* using FOR LooP 
		int fSum = n;
		for (int i = n ; i > 0; --i) 
		{
			fSum += n-i;
		}
		System.out.println("Sum of number "+n+" to '0' is "+fSum);
	*/
	}

}
