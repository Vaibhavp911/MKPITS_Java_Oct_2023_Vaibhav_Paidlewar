package com.mkpits.collection.list.arraylist;

import java.util.ArrayList;

public class ArrayListTest 
{
	public static void main(String[] args) 
	{
		// non generic arraylist
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(58.792);
		list.add("affsf");
		
		// to call elements of arraylist we have to apply loop and store each value of elements in a object 
		// as the data type in arraylist is in mixed form it and object is superclass of all classes.
		
		for (Object object : list) {
			System.out.println(object);
		}
		
	}
}
