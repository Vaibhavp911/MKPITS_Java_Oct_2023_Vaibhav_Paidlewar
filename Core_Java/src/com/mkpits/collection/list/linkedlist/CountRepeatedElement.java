package com.mkpits.collection.list.linkedlist;

import java.util.LinkedList;
import java.util.Objects;

public class CountRepeatedElement {

	public static void main(String[] args) 
	{
		LinkedList<Integer> listA = new LinkedList<>();
		listA.add(0, 1);
		listA.add(1, 2);
		listA.add(2, 3);
		listA.add(3, 2);
		listA.add(4, 2);
		listA.add(5, 2);
		listA.add(6, 15);
		listA.add(7, 7);
		listA.add(8, 8);
		
		byte counter=0;
		System.out.println(listA.size());
		
		for (int i = 0; i < listA.size(); i++) 
		{
			
			for (int j = 8; j > 0; j--) 
			{
				if (Objects.equals(listA.get(i), listA.get(j)))
				{
					System.out.println(listA.get(j));
					counter++;
				}
			}
			System.out.println("Element "+listA.get(i)+" is repeated "+counter+" times");
		}
		
		
	}

}
