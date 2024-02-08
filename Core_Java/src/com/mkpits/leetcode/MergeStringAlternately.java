package com.mkpits.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MergeStringAlternately {

	/* You are given two strings word1 and word2.
	 * Merge the strings by adding letters in alternating order, starting with word1.
	 * If a string is longer than the other, append the additional letters onto the end of the merged string.
	 * Return the merged string.
	 
	Example 1:

		Input: word1 = "abc", word2 = "pqr"
		Output: "apbqcr"
		Explanation: The merged string will be merged as so:
		word1:  a   b   c
		word2:    p   q   r
		merged: a p b q c r
		
	Example 2:

		Input: word1 = "ab", word2 = "pqrs"
		Output: "apbqrs"
		Explanation: Notice that as word2 is longer, "rs" is appended to the end.
		word1:  a   b 
		word2:    p   q   r   s
		merged: a p b q   r   s
	 */
	
	public static void main(String[] args)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		MergeStringAlternately tb = new MergeStringAlternately();
		String word1 = null;
		String word2 = null;
		System.out.print("Enter Word1: ");
		try {
			word1 = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.print("Enter Word2: ");
		try {
			word2 = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(tb.mergeAlternately(word1, word2));
		
	}

	
	public String mergeAlternately(String word1, String word2) 
	{
		StringBuilder sb = new StringBuilder();
		int size = Math.min(word1.length(), word2.length());
		for (int i = 0; i < size; i++) 
		{
			sb.append(word1.charAt(i)).append(word2.charAt(i));
		}
		if (word1.length() > word2.length()) 
		{
			sb.append(word1.substring(word2.length()));
		} else {
			sb.append(word2.substring(word1.length()));
		}
		
		return 	sb.toString();
	}
	
}


