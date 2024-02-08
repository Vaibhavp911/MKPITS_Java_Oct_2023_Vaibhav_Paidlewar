package com.mkpits.collection.list.arraylist;

import java.util.ArrayList;

public class ByteArrayList {

	public static void main(String[] args) 
	{
		ArrayList<Byte> byteAL = new ArrayList<>();
		byteAL.add((byte) 1);
		byteAL.add((byte) 2);
		byteAL.add((byte) 3);
		byteAL.add((byte) 4);
		byteAL.add((byte) 5);
		byteAL.add((byte) 6);
		byteAL.add((byte) 7);
		byteAL.add((byte) 8);
		byteAL.add((byte) 9);
		byteAL.add((byte) 0);
		byteAL.add((byte) 1);
		byteAL.add((byte) 2);
		
		System.out.println(byteAL.size());
		System.out.println("---------");
		// using for each to print the data of ArrayList 'integerAL'
		for (byte bytE : byteAL) {
			System.out.println(bytE);
		}
		
		System.out.println("-----------");
		// using for iterate over an index.
		for (int i = 0; i < byteAL.size(); i++) {
			System.out.println(byteAL.get(i));
		}
	}

}
