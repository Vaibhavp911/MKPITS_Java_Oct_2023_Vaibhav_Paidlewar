package com.mkpits.collection.list.arraylist;

import java.util.ArrayList;

public class StringArrayList {

	public static void main(String[] args) 
	{
		ArrayList<String> stringAL = new ArrayList<>();
		stringAL.add("Vaibhav");
		stringAL.add("Sanjay");
		stringAL.add("Paidlewar");
		System.out.println("Full Name: "+stringAL.get(0)+" "+stringAL.get(1)+" "+stringAL.get(2));
	}

}
