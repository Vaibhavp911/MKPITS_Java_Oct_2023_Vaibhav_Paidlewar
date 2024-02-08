package com.mkpits.collection.list.linkedlist;

public class WhatIsLinkedList {

	public static void main(String[] args)
	{
/* 
	This class is an implementation of the LinkedList data structure which is a linear data structure
	where the elements are not stored in contiguous locations and every element is a separate object
	with a data part and address part.
	elements are linked using pointers and addresses.
	Each element is known as a node.
	
	What is a Linked List?
	A linked list is a linear data structure where elements, called nodes,
	are not stored in contiguous memory locations.
	Each node contains two parts:
	Data: The actual element being stored.
	Next: A reference (pointer) to the next node in the list.
	This arrangement creates a chain-like structure, where each node points to the next one,
	forming the sequence.
	
	When to Use LinkedList:
	Prioritize LinkedList when you need frequent insertions or deletions in the middle of the list.
	When you're unsure of the initial size of the list.
	When memory efficiency is a major concern.
	
	LinkedList is not synchronized, so handle concurrency externally if needed.
	Random access to elements is slower compared to arrays (O(n) time complexity).
	
	Due to the dynamicity and ease of insertions and deletions, they are preferred over the arrays.
	It also has a few disadvantages like the nodes cannot be accessed directly instead
	we need to start from the head and follow through the link to reach a node we wish to access.
	
	LinkedList act as Dynamic Array it does not have any specific size it increases and decreases on need.
	Dynamically add and remove items. And also, the elements are not stored in a continuous fashion
	
	Key Advantages of LinkedList:
	Dynamic Size: Linked lists can grow or shrink as needed without pre-allocating memory.
	Efficient Insertions and Deletions: Adding or removing elements at any position takes constant time (O(1)).
	No Wasted Space: Memory is only used for the actual elements, not empty slots like in arrays.
 */
	}

}
