package com.mkpits.collection.list.linkedlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class MiddleOfLinkedList {

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		LinkedList<Integer> listA = new LinkedList<>();
		System.out.print("Enter Size of List : ");
		short size = Short.parseShort(br.readLine());
		
		for (short i = 0; i < size; i++)
		{
			try {
				System.out.println("enter Element of position "+i+" : ");
				int data = Integer.parseInt(br.readLine());
				listA.add(i, data);
			} 
			catch (NumberFormatException | IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(listA);
		short middle = (short) (size/2);
		
		System.out.println("Middle Number is "+listA.get(middle));
	}

}
