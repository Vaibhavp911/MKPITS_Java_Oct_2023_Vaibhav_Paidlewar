package com.mkpits.typecasting;

public class Explicit_Primitive_To_Object_ViceVersa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		

		//Java provide set of pre-defined classes called wrapper classes
		// String is class
		// wrapper classes are Integer, Float, Byte, Double, Long, Short, Boolean, Character.
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("object to primitive data type type-casting");
		String prise = "236576.353";
		float p = Float.parseFloat(prise);	// Float wrapper class and parseFloat() is method of Float Wrapper class
		System.out.println("String 'prise' value assigned to float 'p' is "+p);
		System.out.println("-----------------------------------------------------------------------------------------");
		// The conversion from String to float involves explicit type casting.
		// The method Float.parseFloat() is used to explicitly convert the String to a float.
		// console only takes string value to store it in data-type we use TypeCasting between primitive to object & vice versa.
		
		System.out.println("primitive to object type-casting");
		int a = 35;
		String getA = Integer.toString(a);
		System.out.println(getA);
		System.out.println("------------------------------------------------------------------------------------------");
		// The conversion from int to String involves explicit type casting.
		// The method Integer.toString() is used to explicitly convert the int to a String
		
		
		// primitive to object
		System.out.println("primitive to object type-casting");
		int i = 43;
		Integer getI = new Integer(i);
		System.out.println(getI);
	}

}