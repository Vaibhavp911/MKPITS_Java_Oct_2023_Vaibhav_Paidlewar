package com.mkpits.collection.set.hashset;

import java.util.HashSet;
import java.util.Set;

public class CleanInSet {

	public static void main(String[] args) 
	{
		Set<String> set1 = new HashSet<>();
		set1.add("vaibhav");
		set1.add("sanjay");
		set1.add("paidlewar");
		set1.add("sanjay");
		set1.add("mahadeo");
		set1.add("paidlewar");
		
		set1.clear();
		System.out.println(set1);
	}

}
