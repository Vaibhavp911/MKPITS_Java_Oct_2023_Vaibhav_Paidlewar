package com.mkpits.arrays;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArrayUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Reversing an array using Java collections 
		// function reverses the elements of the array 
		// collections class didn't works on primitive data types
		Integer[] num= {5,325,6,0,-2,22,46};
		Arrays.sort(num, Collections.reverseOrder());
		
			System.out.println(Arrays.toString(num));

		
		
	}

}
