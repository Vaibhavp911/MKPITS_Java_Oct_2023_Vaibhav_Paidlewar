package com.mkpits.variablescope;

public class Non_Static_Variable {
	// note : non- static member cannot be directly called in static member.
	// note : non-static member can be called directly in non-static member. 
	public int pinCode = 441111; 	//non static variable as it is not declared static 
	public float floatNumber = 15.76567f;
	public byte byteNumber = 122;
	public char charLetter = 'V';
	public double doubleNumber = 2535.1423543654657;
	public long longNumber = 124325436574859086L;
	public boolean  nonStatic = true;
	int testVar = 69;//
	static int abc =987;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Non_Static_Variable variable = new Non_Static_Variable();
		System.out.println("Pincode is "+variable.pinCode);
		System.out.println("floatNumber is "+variable.floatNumber);
		System.out.println("byteNumber is "+variable.byteNumber);
		System.out.println("charLetter is "+variable.charLetter);
		System.out.println("doubleNumber is "+variable.doubleNumber);
		System.out.println("longNumber is "+variable.longNumber);
		System.out.println("boolean nonStatic "+variable.nonStatic);
		Static_Variable sv = new Static_Variable();
		System.out.println("calling static variable in Non-static --> staticVar1: "+sv.staticVar1);
		System.out.println("calling static variable in Non-static --> staticVar1: "+Static_Variable.staticVar1);	
		// calling static variable of other class using classname.variableName 
		System.out.println("-------------------------------------------------------------------------------------");
		// System.out.print(variable.testCall()); this will show error as i already printed in method.
		System.out.println("calling non-static in non-static directly");
		variable.testCall();	// calling non-static in non-static directly.
	}
	
	private void testCall() {
		// calling non-static member directly in non-static member method 
		System.out.println(testVar);
		System.out.println(pinCode);
		System.out.println(abc);	// direct calling of static variable in non static method
	}

}
