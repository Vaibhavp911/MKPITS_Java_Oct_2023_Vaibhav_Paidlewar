package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String name[]= {"Vaibhav", "Sanjay", "Paidlewar" };
		System.out.println("Enter Full Name oF Candidate: "+name[0]+" "+name[1]+" "+name[2]);
		
		System.out.println("***************************************************************************");
		int sorTing[] = new int[4];
		// Datatype arrayname[]=new Datatype[size];
		
		for (int forInput = 0; forInput < sorTing.length; forInput++)
		{
			System.out.println("Enter Data "+forInput);
			sorTing[forInput]= Integer.parseInt(reader.readLine());
		}
		System.out.println("***************************************************************************");
		// Bubble Sorting
		/*
		for (int outerLoop = 0; outerLoop < sorTing.length; outerLoop++)
		{
			for (int innerLoop = outerLoop+1 ; innerLoop < sorTing.length; innerLoop++)
			{
				if (sorTing[outerLoop]>sorTing[innerLoop])
				{
					int temp = sorTing[outerLoop];
					sorTing[outerLoop] = sorTing[innerLoop];
					sorTing[innerLoop] = temp;
				}
			}
		}
		*/
		
		// imported array package sort method called directly to convert it in ascending order. it works same as above bubble sort
		Arrays.sort(sorTing);
		
		
		System.out.println("Data after Sorting ascending order ----> ");
		for (int toPrint = 0; toPrint < sorTing.length; toPrint++) 
		{
			System.out.println("Data at "+toPrint+" is "+sorTing[toPrint]);
		}
		
		
		for (int outerLoop = 0; outerLoop < sorTing.length; outerLoop++)
		{
			for (int innerLoop = outerLoop+1 ; innerLoop < sorTing.length; innerLoop++)
			{
				if (sorTing[outerLoop]<sorTing[innerLoop])
				{
					int temp = sorTing[outerLoop];
					sorTing[outerLoop] = sorTing[innerLoop];
					sorTing[innerLoop] = temp;
				}
			}
		}
		
		System.out.println("***************************************************************************");
		System.out.println("Data after Sorting descending order ----> ");
		for (int toPrint = 0; toPrint < sorTing.length; toPrint++) 
		{
			System.out.println("Data at "+toPrint+" is "+sorTing[toPrint]);
		}
	}

}
