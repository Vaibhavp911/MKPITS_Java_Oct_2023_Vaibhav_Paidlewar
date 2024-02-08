package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindNumInArray {

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader iP = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the size of array : ");
		int input = Integer.parseInt(iP.readLine());
		int array[] = new int[input];
		
		for (int loop = 0; loop < array.length; loop++)
		{
			System.out.println("Enter Digit of Index "+loop+" : ");
			array[loop]= Integer.parseInt(iP.readLine());
		}
		
		System.out.println("-------------------------------------");
		
		System.out.print("Provide user Input : ");
		int userNum = Integer.parseInt(iP.readLine());
		
		for (int loop = 0; loop < array.length; loop++)
		{
			if (array[loop]==userNum)
			{
				System.out.println("User input 'userNum' is in the array at index "+loop+" and position "+(loop+1));
			}
		}
		
		
		
		
		
	}

}
