package com.mkpits.variablescope;

public class This_Demo {

	int x , y ;	// class/globals variable .
	float a,b;
	
	public This_Demo(int x, int y)
	{
		x=x;	// value passed from main but not stored to class/global variable	--> line 31
		y=y;	// LHS 'x','y' are class variable									--> line 31
		System.out.println("Printing X: "+x);
		System.out.println("Printing y: "+y);
	} 
	
	public This_Demo(float a, float b)
	{
		this.a=a; // this keyword allows compiler to store passed value in class variable directly
		this.b=b;
		System.out.println("printing 'a': "+a);
		System.out.println("printing 'b': "+b);
	}
	
	public static void main(String[] args) {

		// Keyword “this” can be used to refer the current object of same class type.
		// It is actually used to differentiate between local variables and instance  variables.
		// I.e. this.variable
		// Refer the instance variable while direct reference to the variable it will refer the local variable not the instance variable
		
		This_Demo tD = new This_Demo(4, 5);	// passing int x = 4, int y=5 to This_Demo(int x,int y)
		System.out.println("printing 'x' and 'y' using 'object-tD' but assigned value remains local to 'x & Y' of class 'This_Demo(int x, int y)' ");
		System.out.println(tD.x);	// calling class variable using object	--> line 5
		System.out.println(tD.y);	// calling class variable using object	--> line 5
		System.out.println("----------------------------");
		System.out.println("printing class variable using 'this' keyword ");
		This_Demo tD1 = new This_Demo(1.1f, 1.5f);	// passing value to This_Demo(float a,float b)	--> line 6
		System.out.println("printing class variable using 'object- tD1' keyword ");
		System.out.println(tD1.a);	// value is stored in class/global variable 'float a' because of 'this' keyword.
		System.out.println(tD1.b);	// value is stored in class/global variable 'float a' because of 'this' keyword.
	}

}
