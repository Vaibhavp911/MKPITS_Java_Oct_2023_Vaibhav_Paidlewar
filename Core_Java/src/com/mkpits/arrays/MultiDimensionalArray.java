package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiDimensionalArray {

	public static void main(String[] args) throws IOException
	{
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int mD[][] = new int [3][2];
		System.out.println("Fill the Array: ");
		for (int outerLoop = 0; outerLoop < mD.length; outerLoop++)
		{
			for (int innerLoop = 0; innerLoop < 2; innerLoop++)
			{
				System.out.println("Enter Data for mD ["+outerLoop+"]["+innerLoop+"]");
				mD[outerLoop][innerLoop] = Integer.parseInt(read.readLine());
			}
		}
		
		System.out.println("--------------------------------------------");
		
		for (int outerLoop = 0; outerLoop < mD.length; outerLoop++)
		{
			for (int innerLoop = 0; innerLoop < 2; innerLoop++)
			{
				System.out.println("Data at mD["+outerLoop+"]["+innerLoop+"] : "+mD[outerLoop][innerLoop]);
			}
		}
		
		
	}

}
