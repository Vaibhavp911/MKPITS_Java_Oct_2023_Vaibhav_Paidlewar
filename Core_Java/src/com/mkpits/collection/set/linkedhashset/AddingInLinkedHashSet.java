package com.mkpits.collection.set.linkedhashset;

import java.util.LinkedHashSet;

public class AddingInLinkedHashSet {

	public static void main(String[] args) 
	{
		// creating linkedHashSet
		LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
		
//		No duplicates allowed
//		Insertion order is preserved
		lhs.add(105);
		lhs.add(95);
		lhs.add(45);
		lhs.add(85);
		lhs.add(55);
		lhs.add(65);
		lhs.add(75);
		lhs.add(105);
		lhs.add(95);
		lhs.add(45);
		lhs.add(85);
		
		System.out.println(lhs);
	}

}
