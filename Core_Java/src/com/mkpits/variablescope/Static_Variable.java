package com.mkpits.variablescope;

public class Static_Variable {
		static int staticVar1 = 3432;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// variable is declared using static keyword just below class declaration above any method is called static variable.
		// Static variable are also called class variable because variable scope belong to class itself
		//:-Value of static variables is sharable by all instance of the class.
		// you can call static variable using 2 methods :-
		// 1] direct calling in the same class.
		System.out.println("calling static variable directly in the same class");
		System.out.println("Static_Var1: "+staticVar1);
		System.out.println("---------------------------------------------------------------------------------------------------------");
		// 2] calling using class name.variable name
		System.out.println("calling static variable using classname.variablename");
		System.out.println("staticVar1: "+Static_Variable.staticVar1);
		System.out.println("---------------------------------------------------------------------------------------------------------");
		// 3] calling static variable using objectname.variablename reference.
		Static_Variable variable_Static = new Static_Variable();
		System.out.println("Calling static variable using objectname.variablename reference");
		System.out.println("static_Var1: "+variable_Static.staticVar1);
		System.out.println("---------------------------------------------------------------------------------------------------------");
		Non_Static_Variable nsv = new Non_Static_Variable();
		System.out.println("calling Non_static variable in static--> Pincode is "+nsv.pinCode);
		System.out.println("calling Non_static variable in static--> floatNumber is "+nsv.floatNumber);
		System.out.println("calling Non_static variable in static--> byteNumber is "+nsv.byteNumber);
		System.out.println("calling Non_static variable in static--> charLetter is "+nsv.charLetter);
		System.out.println("calling Non_static variable in static--> doubleNumber is "+nsv.doubleNumber);
		System.out.println("calling Non_static variable in static--> longNumber is "+nsv.longNumber);
		System.out.println("calling Non_static variable in static--> boolean nonStatic "+nsv.nonStatic);
	}

}
