package com.mkpits.collection.list.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DeclaringLinkedList {

	public static void main(String[] args) 
	{
	  /* to create a LinkedList, we need to create an object of the LinkedList class.
	   * The LinkedList class consists of various constructors that allow the possible creation of the list.
	   */
		List<Integer> listA = new ArrayList<>();
		listA.add(0, 9);
		listA.add(1, 8);
		listA.add(2, 7);
		listA.add(3, 6);
		listA.add(4, 5);
		listA.add(5, 4);
		listA.add(6, 3);
		listA.add(7, 2);
		listA.add(8, 1);
		
		// 1. LinkedList(): This constructor is used to create an empty linked list.
		LinkedList<?> iList = new LinkedList<>();
		System.out.println(iList);
		
		// 2. LinkedList(Collection C): This constructor is used to create an ordered list that contains
		// all the elements of a specified collection, as returned by the collection’s iterator.
		LinkedList<Integer> iList1 = new LinkedList<>(listA);
		System.out.println(iList1);
	}

}
