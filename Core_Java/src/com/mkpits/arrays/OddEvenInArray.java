package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddEvenInArray {

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int[] oddEven = new int[6];
		for(int fIterator = 0 ; fIterator < oddEven.length;fIterator++)
		{
			System.out.print("Enter data in position "+fIterator+" ");
			// taking user input for array oddEven[6]
			oddEven[fIterator] = Integer.parseInt(reader.readLine());
		}
		short evenCounter=0;	// to count number of even number in array oddEven[6]
		short oddCounter=0;		// to count number of odd number in array oddEven[6]
		
		System.out.println("----------------------------------------------------------------");
		for(int secIterator =0 ; secIterator< oddEven.length; secIterator++)
		{
			// condition in if-statement is boolean
			if(oddEven[secIterator]%2==0)
			{
				System.out.println(oddEven[secIterator]+" is Even Number at position "+secIterator);
				evenCounter++;
			}
			
			// condition in if-statement is boolean
			if(oddEven[secIterator]%2!=0)
			{
				System.out.println(oddEven[secIterator]+" is Odd Number at position "+secIterator);
				oddCounter++;
			}
		}
		System.out.println("----------------------------------------------------------------");
		System.out.println("There are total "+evenCounter+" EVEN Number in Array oddEven[6]");
		System.out.println("There are total "+oddCounter+" ODD Number in Array oddEven[6]");
	}

}
