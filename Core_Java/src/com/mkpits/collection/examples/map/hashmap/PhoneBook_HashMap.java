package com.mkpits.collection.examples.map.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class PhoneBook_HashMap 
{
	   public static void main(String[] args) 
	   {
	       try (Scanner scanner = new Scanner(System.in)) {
			int numEntries = Integer.parseInt(scanner.nextLine());

			   HashMap<String, String> phoneBook = new HashMap<>();
			   for (int i = 0; i < numEntries; i++) 
			   {
			       String name = scanner.nextLine();
			       String phoneNumber = scanner.nextLine();
			       phoneBook.put(name, phoneNumber);
			   }

			   while (scanner.hasNextLine()) 
			   {
			       String queryName = scanner.nextLine();
			       String phoneNumber = phoneBook.get(queryName);
			       if (phoneNumber != null) 
			       {
			           System.out.println(queryName + "=" + phoneNumber);
			       } 
			       else {
			           System.out.println("Not found");
			       }
			   }
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }


}
