package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DuplicateElement {
	// finding duplicate element in the array testArray[].
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		int testArray []= new int [5];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// taking input for testArray[5] from the user..
		for (int fIterator = 0; fIterator < testArray.length; fIterator++)
		{
			System.out.print("Enter data of "+fIterator+"th position:");
			testArray[fIterator]= Integer.parseInt(br.readLine());	
		}
		
		
		for (int fLoop = 0; fLoop < testArray.length; fLoop++)
		{
			for (int sLoop = fLoop+1; sLoop < testArray.length; sLoop++)
			{
				// checking duplicate condition.
				if (testArray[fLoop]==testArray[sLoop])
				{
					System.out.println("duplicate element founddd! "+testArray[sLoop]+" at "+sLoop);
				}
			}
		}
	}

}
