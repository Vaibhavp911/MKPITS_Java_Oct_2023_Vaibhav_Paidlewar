package com.mkpits.typecasting;

public class Explicit_TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// NOTE : Console only takes string as InPut.
		// you have to type cast string into int,float according to your need.
		// Implicit conversion is good but not applicable everywhere..
		// we cannot assign the value of int type variable to byte or short type variable
		// 
		long mobile = 9876543211l;
		int m = (int) mobile;
		
		System.out.println(m);
		System.out.println("here 'm' will print value after subtracting with the range ' 9876543211l - 2147483647' as 1286608619 ");
		
		int num = 280;
		byte b = (byte) num;
		System.out.println(b);
		System.out.println("here 'b' will print value after subtracting with the range of byte ' 280 - 256' as 24 ");

		int p = 90;
		char ch = (char) p;
		System.out.println(ch);
		
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("TypeCasting between primitive to object & vice versa");
		// object and primitive datatypes both are two different things therefore we cannot assign the value of one to another
		// Java provide set of pre-defined classes called wrapper classes
		// This classes provide set of constructor and methods using which we can typecast primitive value in an object or an object value in a primitive
		
		
	}

}
