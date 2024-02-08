package com.mkpits.collection.list.linkedlist;

public class DiffnBtArrayListnLinkedList
{
/*
 
 ArrayList:
 Under the hood, it uses a re-sizable array to store elements.
 Elements are placed in contiguous memory locations.
 
 LinkedList:
 It uses a doubly linked list structure, where each element (node) contains data and references
 to the next and previous nodes, forming a chain-like structure.

		-------------------------------------------------------------
		| Operation				 |	ArrayList		|	  LinkedList|
		-------------------------------------------------------------
		|Access by index		 |	O(1)(fast)		|	  O(n)(slow)|
		-------------------------------------------------------------
		|Add/remove at the end	 |	O(1) amortized  |     O(1)(fast)|
		|						 |	(generally fast)|				|
		-------------------------------------------------------------
		|Add/remove in the middle|	O(n)(slow)		|     O(1)(fast)|
		-------------------------------------------------------------

 Memory:
	ArrayList: May have some wasted space due to initial capacity and resizing, but it's more cache-friendly.
	LinkedList: More memory-efficient as it only allocates memory for actual elements, not empty slots.
 
 Use Cases:
	ArrayList:
	When frequent random access to elements is needed.
	When you know the approximate size of the list beforehand.
	Handling large data sets that benefit from cache locality.
	
	LinkedList:
	When frequent insertions or deletions in the middle of the list are required.
	When the initial size of the list is unknown.
	Implementing stacks and queues.
Representing graphs.
*/

}
