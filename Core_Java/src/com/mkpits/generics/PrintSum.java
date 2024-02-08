package com.mkpits.generics;

public class PrintSum<T extends Number> {
	
	public void print(T[] arr)
	{
		double sum = 0;
		for(T x : arr)
		{
			sum = sum + x.doubleValue();
			/// this method is of class Number so we can use it.
		}
		
		System.out.println("Sum = "+sum);
	}

}
