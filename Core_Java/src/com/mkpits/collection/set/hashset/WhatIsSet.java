package com.mkpits.collection.set.hashset;

import java.util.HashSet;
import java.util.Set;

public class WhatIsSet {

	public static void main(String[] args) 
	{
/*
		* It is an unordered collection of objects in which duplicate values cannot be stored.
		* This interface contains the methods inherited from the Collection interface and 
		  adds a feature that restricts the insertion of the duplicate elements.
		* set -->(extends)--> sorted set -->(extends)--> navigable set-->(implements)--> Tree Set.
		* set does not retain the insertion order, the navigable set interface 
			provides the implementation to navigate through the Set.
		* set does not repeat the element.
		* set print order  is not defined it will print randomly.
*/

		Set<String> set = new HashSet<>();
		// Set is an interface, objects cannot be created of the type set.
		// We always need a class that extends this list in order to create an object. 
		
		// printing set using lambda function
				set.forEach(System.out::println);
				boolean empty = set.isEmpty();
				System.out.println(empty);
			//	(empty) -> System.out.println("Set is "+empty);
	}

}
