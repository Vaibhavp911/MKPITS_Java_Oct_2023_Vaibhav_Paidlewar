package com.mkpits.collection.list.arraylist;

import java.util.ArrayList;

public class IntegerArrayList {

	public static void main(String[] args) 
	{
		ArrayList<Integer> integerAL = new ArrayList<>();
		integerAL.add(31);
		integerAL.add(32);
		integerAL.add(33);
		integerAL.add(34);
		integerAL.add(35);
		integerAL.add(36);
		integerAL.add(37);
		integerAL.add(38);
		integerAL.add(39);
		integerAL.add(40);
		integerAL.add(41);
		integerAL.add(42);
		
		System.out.println(integerAL.size());
		System.out.println("---------");
		// using for each to print the data of ArrayList 'integerAL'
		for (Integer integer : integerAL) {
			System.out.println(integer);
		}
		
		System.out.println("-----------");
		// using for iterate over an index.
		for (int i = 0; i < integerAL.size(); i++) {
			System.out.println(integerAL.get(i));
		}
	}

}
