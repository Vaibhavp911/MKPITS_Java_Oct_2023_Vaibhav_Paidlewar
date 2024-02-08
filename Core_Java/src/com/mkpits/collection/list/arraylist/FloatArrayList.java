package com.mkpits.collection.list.arraylist;

import java.util.ArrayList;

public class FloatArrayList {

	public static void main(String[] args) 
	{
		ArrayList<Float> floatAL = new ArrayList<>();
		floatAL.add(31.25f);
		floatAL.add(32.25f);
		floatAL.add(33.25f);
		floatAL.add(34.25f);
		floatAL.add(35.25f);
		floatAL.add(36.25f);
		floatAL.add(37.25f);
		floatAL.add(38.25f);
		floatAL.add(39.25f);
		floatAL.add(40.25f);
		floatAL.add(41.25f);
		floatAL.add(42.25f);
		
		System.out.println(floatAL.size());
		System.out.println("---------");
		// using for each to print the data of ArrayList 'floatAL'
		for (Float floaT : floatAL) {
			System.out.println(floaT);
		}
		
		System.out.println("-----------");
		// using for iterate over an index.
		for (int i = 0; i < floatAL.size(); i++) {
			System.out.println(floatAL.get(i));
		}
	}
}
