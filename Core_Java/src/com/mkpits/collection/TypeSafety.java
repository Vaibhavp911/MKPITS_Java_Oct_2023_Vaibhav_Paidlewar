package com.mkpits.collection;

import java.util.ArrayList;

public class TypeSafety {

	public static void main(String[] args) 
	{
		// generic type 
		// below array list type is defined or we can say strArr is bounded.
		ArrayList<String> strArr = new ArrayList<String>();
		strArr.add("Ahmedabad");
		strArr.add("Nagpur");
		strArr.add("Mumbai");
		strArr.add("Wardha");
		strArr.add("Amravati");
		strArr.add("Gondia");
//		strArr.add(1); compile time error
		
		// for bounded array list you dont have to create object to print elements of array list 
		// as the type is defined.

		for (String value : strArr) {
			System.out.println(value);
		}
	}

}
