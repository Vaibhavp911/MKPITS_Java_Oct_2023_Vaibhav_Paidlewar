package com.mkpits.collection.set.hashset;

import java.util.HashSet;
import java.util.Set;

public class AddingInSet {

	public static void main(String[] args) 
	{

/*
 * the insertion order is not retained in the Set.
 * Internally, for every element, a hash is generated and the values are stored with respect to the generated hash.
 * the values are compared and sorted in ascending order.
 * We need to keep a note that duplicate elements are not allowed and all the duplicate elements are ignored.
 * And also, Null values are accepted by the Set.
 */
		Set<String> set1 = new HashSet<>();
		set1.add("vaibhav");
		set1.add("sanjay");
		set1.add("paidlewar");
		set1.add("sanjay");
		set1.add("mahadeo");
		set1.add("paidlewar");
		
		// printing set using lambda function
		set1.forEach(System.out::println);
		
		// simply printing using sysout.
		System.out.println(set1);
		
		Set<Character> set2 = new HashSet<>();
		set2.add('A');
		set2.add('B');
		set2.add('C');
		set2.add('D');
		set2.add('E');
		set2.add('F');
		// PRINTING SET2 USING LAMBDA FUNCTION
		set2.forEach(System.out::println);
		
		// printing set3 using sysout
		System.out.println(set2);
		
		Set<Character> set3 = new HashSet<>();
		set3.add('G');
		set3.add('K');
		set3.add('H');
		set3.add('J');
		set3.add('F');
		set3.add('I');
		// PRINTING SET2 USING LAMBDA FUNCTION
		set3.forEach(System.out::println);
		
		// printing set3 using sysout
		System.out.println(set3);
		
		System.out.println(set2.addAll(set3));
		set2.forEach(System.out::println);
		
//		System.out.println(set2.contains(set3));	//true if this set contains the specified element
//		System.out.println(set3.contains(set2));
		
		Set<Character> set4 = new HashSet<>();
		System.out.println(set4.addAll(set3));
		System.out.println(set4);
		System.out.println(set3.contains('G'));
	//	s.Each(System.out.println(set4.contains(set3)));
		for (Character ch : set4) {
			System.out.println(set4.contains(set3));
			System.out.println(ch);
		}
	}

}
