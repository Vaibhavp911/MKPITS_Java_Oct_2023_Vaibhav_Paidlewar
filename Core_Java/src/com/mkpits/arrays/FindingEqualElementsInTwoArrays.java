package com.mkpits.arrays;

import java.util.Arrays;

public class FindingEqualElementsInTwoArrays {

	public static void main(String[] args) {

		char[] arrayOne = {'a','b','c','d'};
		char[] arrayTwo = {'g','f','h','d'};
		
		Arrays.sort(arrayOne);
		Arrays.sort(arrayTwo);
		for (int i = 0; i < arrayOne.length; i++) {
			for (int j = 0; j < arrayTwo.length; j++) {
				if (arrayOne.equals(arrayTwo)) {
					arrayOne[i]=arrayTwo[j];
					System.out.println("element is present in both array "+arrayTwo[j]);
				}else {
					System.out.println("both arrays dont have any equal element");
				}
					
			}
			
		}
		
			
		
				
			
			

	}

}
