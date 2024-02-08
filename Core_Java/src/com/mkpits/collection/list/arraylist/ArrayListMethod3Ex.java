package com.mkpits.collection.list.arraylist;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListMethod3Ex {

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
		
		/* 1. boolean isEmpty()
		 * Returns true if this list contains no elements.
		 */
		System.out.println(listA.isEmpty());
		
		/* 2. get(int index)
		 * Returns the element at the specified position in this list.
		 */
		System.out.println(listA.get(6));
		
		/* 3. getFirst()
		 * Gets the first element of this collection
		 * not available in jdk21 is in jdk17
		 */
		//System.out.println(listA.getfirst());
		
		/* 4. set(int index, E element)
		 * Replaces the element at the specified position in this list with the specified element.
		 */
		listA.set(7, 2345);
		System.out.println(listA);
		
		/* 5. boolean equals(Object o)
		 * Compares the specified object with this list for equality.
		 * Returns true if and only if the specified object is also a list,
		 * both lists have the same size, and all corresponding pairs of elements in the two lists are equal.
		 * (Two elements e1 and e2 are equal if (e1==null ? e2==null : e1.equals(e2)).)
		 * In other words, two lists are defined to be equal if they contain the same elements in the same order.
		 */
		System.out.println(listA.get(6).equals(3));
		
		/* 6. ListIterator<E> listIterator()
		 * Returns a list iterator over the elements in this list (in proper sequence).
		 * The returned list iterator is fail-fast.
		 */
		ListIterator<Integer> lisIte = listA.listIterator();
		System.out.println("forward traversal");
		while (lisIte.hasNext()) 
		{	/* Returns true if this list iterator has more elements whentraversing the list in the forward direction.
			 *(In other words,returns true if next would return an element ratherthan throwing an exception.)
			 */
			System.out.print(lisIte.next());
			/* Returns the next element in the list and advances the cursor position.
			 * This method may be called repeatedly to iterate through the list,
			 * or intermixed with calls to previous to go back and forth
			 */
		}
		
		System.out.println("\nforward traversal");
		while (lisIte.hasPrevious()) 
		{ 
		// Returns true if this list iterator has more elements when traversing the list in the reverse direction.
			System.out.print(lisIte.previous());
		/* Returns the previous element in the list and moves the cursor position backwards.
		 * This method may be called repeatedly to iterate through the list backwards,
		 * or intermixed with calls to next to go back and forth.
		 */
		}
	}

}
