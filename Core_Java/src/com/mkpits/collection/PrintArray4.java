package com.mkpits.collection;

public class PrintArray4<T> 
{
	// T = formal object
	public void print(T[] test) 
	{
		for (T t : test) {
			System.out.println(t);
		}
	}
	
	public static void main(String[] args) 
	{
		Integer[] intArr = { 1, 2, 3, 4, 5, 6 };
		String[] strArr = { "Shrikant", "Ashik", "Raj", "Vinay" };

		// generic version bounded type Integer.
		PrintArray4<Integer> ar4 = new PrintArray4<>();
		ar4.print(intArr);
		
		// generic version bounded type String.
		PrintArray4<String> ar5 = new PrintArray4<>();
		ar5.print(strArr);
	}

}
