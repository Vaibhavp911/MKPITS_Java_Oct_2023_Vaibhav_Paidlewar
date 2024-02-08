package com.mkpits.collection.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethod2Ex
{
	
	public static void main(String[] args) 
	{
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
		/* 1. int indexOf(Object o)
		 * Returns the index of the first occurrence of the specified element in this list,
		 * or -1 if this list does not contain the element.
		 * More formally, returns the lowest index i such that Objects.equals(o, get(i)),
		 * or -1 if there is no such index.
		 */
		System.out.println(listA);
		System.out.println(listA.indexOf(5));
		
		/* 2. boolean isEmpty()
		 * Returns true if this list contains no elements.
		 */
		System.out.println(listA.isEmpty());
		
		/* 3. boolean contains(Object o)
		 * Returns true if this list contains the specified element.
		 * More formally, returns true if and only if this list contains
		 * at least one element e such that Objects.equals(o, e).
		 */
		System.out.println(listA.contains(7));
		
		/* 4. int lastIndexOf(Object o)
		 * Returns the index of the last occurrence of the specified element in this list,
		 * or -1 if this list does not contain the element.
		 * More formally, returns the highest index i such that Objects.equals(o, get(i)),
		 * or -1 if there is no such index.
		 */
		System.out.println(listA.lastIndexOf(2));
		
		/* 5. remove(int index)
		 * Removes the element at the specified position in this list.
		 * Shifts any subsequent elements to the left (subtracts one from their indices).
		 */
		listA.remove(8);
		System.out.println(listA);
		
		/* 6. void ensureCapacity(int minCapacity)
		 * Increases the capacity of this ArrayList instance, 
		 * if necessary, to ensure that it can hold at least the number of elements 
		 * specified by the minimum capacity argument.
		 */
		
		/* 7. int size()
		 * Returns the number of elements in this list.
		 */
		System.out.println(listA.size());
	}
	
}
