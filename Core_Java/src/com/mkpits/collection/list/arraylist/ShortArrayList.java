package com.mkpits.collection.list.arraylist;

import java.util.ArrayList;

public class ShortArrayList {

	public static void main(String[] args) 
	{
		ArrayList<Short> shortAL = new ArrayList<>();
		shortAL.add((short) 1);
		shortAL.add((short) 2);
		shortAL.add((short) 3);
		shortAL.add((short) 4);
		shortAL.add((short) 5);
		shortAL.add((short) 6);
		shortAL.add((short) 7);
		shortAL.add((short) 8);
		shortAL.add((short) 9);
		shortAL.add((short) 0);
		shortAL.add((short) 1);
		shortAL.add((short) 2);
		
		System.out.println(shortAL.size());
		System.out.println("---------");
		// using for each to print the data of ArrayList 'integerAL'
		for (short shorT : shortAL) {
			System.out.println(shorT);
		}
		
		System.out.println("-----------");
		// using for iterate over an index.
		for (int i = 0; i < shortAL.size(); i++) {
			System.out.println(shortAL.get(i));
		}

	}

}
