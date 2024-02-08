package com.mkpits.typecasting;

public class Implicit_TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Implicit:-These type of conversion is takes place only if destination type variable is larger than source type variable,
		// but reverse is not allowed.
		// e.g
		 
		byte a=1;
		System.out.println("byte value "+a);
		short b= a;	// short size 2 byte
		System.out.println("short value "+b);
		int c =  b;		// int size 4 bytes
		System.out.println("int value "+c);
		// you can store smaller size data type in larger size data type ---> these is also known as widening
		// you not able to store bigger data type in smaller data type
		// note you can not store short value in short data type
		long d = c;
		System.out.println("long value "+d);
		float f = d; // 2nd highest
		System.out.println("float value "+f);
		double e = f;	// 1st highest
		System.out.println("double value "+e);
		
		
	}

}
