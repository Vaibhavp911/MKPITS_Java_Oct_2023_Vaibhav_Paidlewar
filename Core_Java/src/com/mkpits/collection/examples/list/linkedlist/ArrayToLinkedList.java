package com.mkpits.collection.examples.list.linkedlist;


// Importing array, List & LinkedList classes from
// java.util package
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayToLinkedList {

	public static void main(String[] args) 
	{
		// Program to convert Array to LinkedList

	

				// Create a string Array
				String[] strArr = { "A", "B", "C", "D", "E" };
				System.out.println("Printing Array String");
				for (int i = 0; i < strArr.length; i++) 
				{
					System.out.print(strArr[i]+",");
				}
				System.out.println();
				// Convert array to list
				List<String> list = Arrays.asList(strArr);

				// Create a LinkedList and
				// pass List in LinkedList constructor
				LinkedList<String> linkedList
					= new LinkedList<String>(list);

				// Display and print all elements of LinkedList
				System.out.println("LinkedList of above array : "
								+ linkedList);
			}
}
