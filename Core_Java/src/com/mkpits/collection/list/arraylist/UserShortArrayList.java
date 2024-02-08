package com.mkpits.collection.list.arraylist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class UserShortArrayList {

	public static void main(String[] args) 
	{
		ArrayList<Short> shortAL = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// using for each to print the data of ArrayList 'integerAL'
		for (int i = 0; i < 5; i++) 
		{
			System.out.println("Enter data of position "+i+" :");
			try {
				shortAL.add(Short.parseShort(br.readLine()));
			} catch (NumberFormatException | IOException e) {
				
				e.printStackTrace();
			}
		}
		
		System.out.println("---------------------");
		for (Short shorT : shortAL) {
			System.out.println(shorT);
		}
	}

}
