package com.mkpits.collection.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod1Ex {

	public static void main(String[] args) 
	{
		List<Integer> listA = new ArrayList<>();
		
		/* 1. void add(int index,E element)
		 *  Inserts the specified element at the specified position in this list.
		 *  Shifts the element currently at that position (if any) and any subsequent 
		 *  elements to the right (adds one to their indices).
		 */
		listA.add(0, 9);
		listA.add(1, 8);
		listA.add(2, 7);
		listA.add(3, 6);
		listA.add(4, 5);
		listA.add(5, 4);
		listA.add(6, 3);
		listA.add(7, 2);
		listA.add(8, 1);
		
		System.out.println(listA);
		/* 2. boolean add(E e)
		 * Appends the specified element to the end of this list.
		 * e - element to be appended to this list
		 * Return - True
		 */
		listA.add(0);
		System.out.println(listA);
		
		/* 3. boolean addAll(Collection<? extends E> c)
		 * Appends all of the elements in the specified collection to the end of this list,
		 * in the order that they are returned by the specified collection's Iterator.
		 * The behavior of this operation is undefined if the specified collection is modified
		 * while the operation is in progress. 
		 * (This implies that the behavior of this call is undefined if the specified
		 * collection is this list, and this list is nonempty.)
		 */
		List<Integer> listB = new ArrayList<>();
		listB.add(11);
		listB.add(12);
		listB.add(13);
		listB.add(14);
		listB.add(15);
		listB.add(16);
		listB.add(17);
		listB.add(18);
		listB.add(19);
		
		listA.addAll(listB);
		System.out.println(listA);
	}

}
