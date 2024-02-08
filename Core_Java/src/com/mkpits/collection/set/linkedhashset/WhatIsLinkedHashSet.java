package com.mkpits.collection.set.linkedhashset;

import java.util.LinkedHashSet;

public class WhatIsLinkedHashSet {

	public static void main(String[] args) 
	{
/*
	LinkedHashSet is an ordered version of HashSet that maintains a doubly-linked List across all elements.
	When the iteration order is needed to be maintained this class is used.
	LinkedHashSet lets us iterate through the elements in the order in which they were inserted.
	elements will be returned in the order in which they were inserted.
	
	-Use LinkedList when you need a collection that lets you easily add/remove elements anywhere, even duplicates.
	-Use LinkedHashSet when you need a unique, ordered collection where maintaining insertion order is important.
	-Both LinkedList and LinkedHashSet have higher memory overhead compared to other collections like ArrayList
	and HashSet due to the linked list structure.Both are not thread-safe and require
	external synchronization if used concurrently.
 */
	//	1. LinkedHashSet(): This constructor is used to create a default HashSet

		LinkedHashSet<Integer> hs = new LinkedHashSet<>();
	//	2. LinkedHashSet(Collection C): Used in initializing the HashSet with the elements of the collection C.

	//	LinkedHashSet<E> hs = new LinkedHashSet<E>(Collection c);
	//	3. LinkedHashSet(int size): Used to initialize the size of the LinkedHashSet with the integer mentioned in the parameter.

	//	LinkedHashSet<E> hs = new LinkedHashSet<E>(int size);
		
	//  4. LinkedHashSet(int capacity, float fillRatio): 
	//Can be used to initialize both the capacity and the fill ratio, also called the load capacity 
//	  of the LinkedHashSet with the arguments mentioned in the parameter. 
//	  When the number of elements exceeds the capacity of the hash set is multiplied
//	  with the fill ratio thus expanding the capacity of the LinkedHashSet.

	// 	LinkedHashSet<E> hs = new LinkedHashSet<E>(int capacity, int fillRatio);
	}

}
