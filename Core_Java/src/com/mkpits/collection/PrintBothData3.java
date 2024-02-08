package com.mkpits.collection;


public class PrintBothData3 
{
	public static void main(String[] args) {
	Integer[] intArr = { 1, 2, 3, 4, 5, 6 };
	PrintIntegerArray1 pIA1 = new PrintIntegerArray1();
	pIA1.print(intArr);

	String[] strArr = { "Shrikant", "Ashik", "Raj", "Vinay" };
	PrintStringArray2 pIA2 = new PrintStringArray2();
	pIA2.print(strArr);
	
	// conclusion : we have to call each method by creating their object.
	}
}
