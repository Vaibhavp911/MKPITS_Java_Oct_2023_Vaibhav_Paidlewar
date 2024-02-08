package com.mkpits.collection.list.arraylist;

import java.util.ArrayList;

public class CharacterArrayList {

	public static void main(String[] args) {

		ArrayList<Character> characterAL = new ArrayList<>();
		characterAL.add('a');
		characterAL.add('b');
		characterAL.add('c');
		characterAL.add('d');
		characterAL.add('e');
		characterAL.add('f');
		characterAL.add('g');
		characterAL.add('h');
		characterAL.add('i');
		characterAL.add('j');
		characterAL.add('k');
		characterAL.add('l');
		
		System.out.println(characterAL.size());
		System.out.println("---------");
		// using for each to print the data of ArrayList 'integerAL'
		for (Character integer : characterAL) {
			System.out.println(integer);
		}
		
		System.out.println("-----------");
		// using for iterate over an index.
		for (int i = 0; i < characterAL.size(); i++) {
			System.out.println(characterAL.get(i));
		}
	}

}
