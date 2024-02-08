package com.mkpits.generics;

public class GenericsClass {

	public static void main(String[] args) {

		// we have to use Wrapper classes, primitive data type is not valid in generic.
		// UnBounded class i.e we can print any type of data.
		
		Integer[] numArray = {234,62,262,63,35,68};
		PrintData<Integer> printIntArray = new PrintData<>();
		printIntArray.print(numArray);
		
		Double[] doubleArray = {461.1664,5265.49,97.35,656.78,613.2};
		PrintData<Double> printDouArray = new PrintData<>();
		printDouArray.print(doubleArray);

	}

}

class PrintData<T> {

	public void print(T[] aArray) {
		
		for (T tTtT : aArray) {
			System.out.println(tTtT);
		}
		System.out.println("-------------");
		
	}
	
}
