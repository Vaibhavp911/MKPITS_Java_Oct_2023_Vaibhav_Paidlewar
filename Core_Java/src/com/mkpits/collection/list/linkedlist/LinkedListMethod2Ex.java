package com.mkpits.collection.list.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethod2Ex {

	public static void main(String[] args) 
	{
		LinkedList<Integer> listA = new LinkedList<>();
		listA.add(0, 9);
		listA.add(1, 8);
		listA.add(2, 7);
		listA.add(3, 6);
		listA.add(4, 5);
		listA.add(5, 4);
		listA.add(6, 3);
		listA.add(7, 2);
		listA.add(8, 1);
		
		LinkedList<Integer> listB = new LinkedList<>();
		listB.add(0, 1);
		listB.add(1, 2);
		listB.add(2, 3);
		listB.add(3, 4);
		listB.add(4, 5);
		listB.add(5, 6);
		listB.add(6, 7);
		listB.add(7, 8);
		listB.add(8, 9);
		
		/* 8. void addFirst(E e)
		 * Inserts the specified element at the beginning of this list. 
		 */
		
		/* 9. spliterator()
		 * Creates a late-binding and fail-fast Spliterator over the elements in this list.
		 * The Spliterator reports Spliterator.SIZED and Spliterator.ORDERED.
		 */
		listA.spliterator();
		System.out.println(listA);
		
		/* 10. removeFirst()
		 * Removes and returns the first element from this list.
		 */
		listA.removeFirst();
		System.out.println(listA);
		
		/* 11. removeLast()
		 * Removes and returns the last element from this list.
		 */
		
		listA.removeLast();
		System.out.println(listA);
		
		/* 12. element()
		 * Retrieves, but does not remove, the head (first element) of this list.
		 * Returns: the head of this list
		 */
		System.out.println(listA.element());
		
		/* 13. pop()
		 * Pops an element from the stack represented by this list. In other words, removes and returns the first element of this list.
		 * This method is equivalent to removeFirst().
		 */
		System.out.println(listA.pop());
		System.out.println(listA);
		
		/* 14. descendingIterator()
		 * Description copied from interface: Dequeue
		 * Returns an iterator over the elements in this dequeue in reverse sequential order.
		 * The elements will be returned in order from last (tail) to first (head).
		 */ 
		  
        // print list with descending order 
        try{
        	System.out.println("listB "+listB);
    		Iterator<Integer> x = listB.descendingIterator();
        	while (x.hasNext()) { 
            System.out.println("Value is "+ x.next()); 
        		} 
        	} 
        catch (NullPointerException e)
        { 
        	System.out.println("Exception thrown : "+ e); 
        } 
		System.out.println(listB.descendingIterator());
		
		/* 15. void push(E e)
		 * Pushes an element onto the stack represented by this list.
		 * In other words, inserts the element at the front of this list.
		 * This method is equivalent to addFirst(E).
		 */
		listB.push(100);
		System.out.println(listB);

		
	}

}
