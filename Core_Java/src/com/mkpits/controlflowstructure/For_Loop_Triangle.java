package com.mkpits.controlflowstructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class For_Loop_Triangle {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
	
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Draw Triangle");
		System.out.print("Enter Number : ");
		int a = Integer.parseInt(read.readLine());
		
		// bigger to smaller
		for (int i = 0 ; i <= a ; i++)
		{
			for (int j = 1; j <= (a-i); ++j) {
				System.out.print("*");

			}
			System.out.println();
		}
		
		System.out.println("-----------------------------------------");
		// smaller to bigger
		for (int i = 1; i <= a ; i++)
		{
			for (int j = 0; j < i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------------------");
		
		System.out.println("Upper Triangle");
		for (int i = 0 ; i <= a ; i++)
		{
			for (int j = 1; j <= (a-i); ++j)
			{
				System.out.print(" ");

			}
			
			for (int j = 0; j < i; j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		
	}

}
