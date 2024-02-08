package com.mkpits.collection.list.arraylist;

import java.util.ArrayList;

public class DoubleArrayList {

	public static void main(String[] args) 
	{
		ArrayList<Double> doubleAL = new ArrayList<>();
		doubleAL.add(31.54146);
		doubleAL.add(32.54146);
		doubleAL.add(33.54146);
		doubleAL.add(34.54146);
		doubleAL.add(35.54146);
		doubleAL.add(36.54146);
		doubleAL.add(37.54146);
		doubleAL.add(38.54146);
		doubleAL.add(39.54146);
		doubleAL.add(40.54146);
		doubleAL.add(41.54146);
		doubleAL.add(42.54146);
		
		System.out.println(doubleAL.size());
		System.out.println("---------");
		// using for each to print the data of ArrayList 'integerAL'
		for (Double integer : doubleAL) {
			System.out.println(integer);
		}
		
		System.out.println("-----------");
		// using for iterate over an index.
		for (int i = 0; i < doubleAL.size(); i++) {
			System.out.println(doubleAL.get(i));
		}
	}


}
