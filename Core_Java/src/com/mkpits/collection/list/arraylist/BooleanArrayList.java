package com.mkpits.collection.list.arraylist;

import java.util.ArrayList;

public class BooleanArrayList {

	public static void main(String[] args) 
	{
		ArrayList<Boolean> booleanAL = new ArrayList<>();
		booleanAL.add(true);
		booleanAL.add(false);
		booleanAL.add(true);
		booleanAL.add(false);
		booleanAL.add(true);
		booleanAL.add(false);
		booleanAL.add(true);
		booleanAL.add(false);
		booleanAL.add(false);
		booleanAL.add(true);
		booleanAL.add(false);
		booleanAL.add(true);
		
		System.out.println(booleanAL.size());
		System.out.println("---------");
		// using for each to print the data of ArrayList 'integerAL'
		for (Boolean booleaN : booleanAL) {
			System.out.println(booleaN);
		}
		
		System.out.println("-----------");
		// using for iterate over an index.
		for (int i = 0; i < booleanAL.size(); i++) {
			System.out.println(booleanAL.get(i));
		}
	}

}
