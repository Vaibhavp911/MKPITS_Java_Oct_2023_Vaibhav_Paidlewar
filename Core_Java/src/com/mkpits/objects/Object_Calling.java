package com.mkpits.objects;

import com.mkpits.methods.Calling_Method_Using_Return_Type_NonStatic;

public class Object_Calling {

	public static void main(String[] args) {

		// Object are instances of the class use to access members of the class.
		// you can create any instance using keyword, "new" and using constructor(at least default constructor).
		// ClassName objectName  = new ClassName();
		// objectName is the allocation of memory
		// new is the default constructor.
		System.out.println("----------------------------------------------------------------------------------");
		// object are created to call variables of other class or method.
		// let's create an object to call variable of 
		Calling_Method_Using_Return_Type_NonStatic objCalling = new Calling_Method_Using_Return_Type_NonStatic();
		System.out.println(objCalling.getFirstName());
		objCalling.getFirstName(); // it will not print as that method dont have sysout if sysout is there it will definitely print the data.
		System.out.println("----------------------------------------------------------------------------------");
		objCalling.getAllData(); // here getAllData() method has sysout to print the value 
	}

}
