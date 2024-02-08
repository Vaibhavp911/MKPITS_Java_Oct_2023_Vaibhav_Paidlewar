package com.mkpits.collection.list.arraylist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class UserByteArrayList {

	public static void main(String[] args) 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Byte> ByteAL = new ArrayList<>();
		// using for each to print the data of ArrayList 'integerAL'
		for (int i = 0; i < 5; i++) 
		{
			System.out.println("Enter data of position "+i+" :");
			try {
				ByteAL.add(Byte.parseByte(br.readLine()));
			} catch (NumberFormatException | IOException e) {
				
				e.printStackTrace();
			}
		}
		
		System.out.println("---------------------");
		for (Byte bytE : ByteAL) {
			System.out.println(bytE);
		}
	}

}
