package com.mkpits.collection.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethod4Ex {

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
		
		System.out.println(listA);
		/* 1. Object[] toArray()
		 * Returns an array containing all of the elements in this list in proper sequence (from first to last element).
		 * The returned array will be "safe" in that no references to it are maintained by this list. (In other words, this method must allocate a new array). The caller is thus free to modify the returned array.
		 */
		System.out.println(listA.toArray()); // it will print random value 
		// it require object to store and print the value.
        System.out.println(Arrays.toString(listA.toArray()));
        
		
		List<Integer> listB = new ArrayList<>();
		listB.add(11);
		listB.add(12);
		listB.add(3);
		listB.add(14);
		listB.add(15);
		listB.add(16);
		listB.add(17);
		listB.add(18);
		listB.add(19);
		System.out.println(listB);
		
		/* 2. boolean retainAll(Collection<?> c)
		 * Retains only the elements in this list that are contained in the specified collection.
		 * In other words, removes from this list all of its elements that are not contained in the specified collection.
		 */
		System.out.println(listA.retainAll(listB));
		listA.retainAll(listB);
		System.out.println(listA);
		
		/* 3. void trimToSize()
		 * Trims the capacity of this ArrayList instance to be the list's current size.
		 * An application can use this operation to minimize the storage of an ArrayList instance.
		 */
		
	}

}
