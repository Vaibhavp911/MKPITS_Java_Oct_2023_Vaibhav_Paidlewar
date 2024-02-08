package com.mkpits.collection.list.stack;

import java.util.Stack;

public class CreateAStack {

	
	public static void main(String[] args) 
	{
		// non-generic version
		Stack testStack3 = new Stack();
		// generic version
		Stack <Integer> testStack1 = new Stack<>();
		Stack<Integer> testStack2 = new Stack<>();
		
		/* 1. E push(E item)
		 * Pushes an item onto the top of this stack. This has exactly the same effect as:
		 */
		testStack1.push(576);
		testStack1.push(5867);
		testStack1.push(456);
		System.out.println("testStack1 "+testStack1.empty());
		
		testStack2.push(344);
		testStack2.push(3543);
		testStack2.push(987);
		System.out.println("testStack2 "+testStack2.empty());
		
		/* 2. E peek()
		 * Looks at the object at the top of this stack without removing it from the stack.
		 */
		System.out.println("Printing testStack1() ");
		System.out.println(testStack1.peek());
		System.out.println(testStack1.peek());
		System.out.println(testStack1.peek());
		System.out.println("Printing testStack2() ");
		System.out.println(testStack2.peek());
		System.out.println(testStack2.peek());
		System.out.println(testStack2.peek());
		
		/* 3. E pop()
		 * Removes the object at the top of this stack and returns that object as the value of this function.
		 */
		System.out.println("testStack1");
		System.out.println(testStack1.pop());
		System.out.println(testStack1.pop());
		System.out.println(testStack1.pop());
		System.out.println("----------------");
		System.out.println("testStack2");
		System.out.println(testStack2.pop());
		System.out.println(testStack2.pop());
		System.out.println(testStack2.pop());
		
		/* 4. boolean empty()
		 * Tests if this stack is empty.
		 * Returns: true if and only if this stack contains no items; false otherwise.
		 */
		System.out.println("testStack1: "+testStack1.empty());
		System.out.println("testStack2: "+testStack2.empty());
		
		/* 5. int search(Object o)
		 * Returns: the 1-based position where an object is on this stack.
		   If the object o occurs as an item in this stack,
		   this method returns the distance from the top of the stack of the occurrence
		   nearest the top of the stack; the topmost item on the stack is considered to be at distance 1.
		   The equals method is used to compare o to the items in this stack.
		 */
		testStack1.push(576);
		testStack1.push(5867);
		testStack1.push(456);
		System.out.println(testStack1.search(testStack2));	// value is not in the testStack1
		System.out.println(testStack1.search(456));	// element is present in testStack1
		
		/* 6. copyInto(Object []array)
		 * Copies the components of this vector into the specified array.
		 */
		Integer[] testArray = new Integer[3];
		testStack1.copyInto(testArray);
		for (Integer integer : testArray) {
			System.out.print(integer+", ");
		}
		testStack1.remove(0);
		System.out.println(testStack1);
	}

}
