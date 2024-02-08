package com.mkpits.interfaces;

public class CallingMIClass {

	/*
	 * Java does not support "multiple inheritance" (a class can only inherit from one superclass).
	 * However, it can be achieved with interfaces, because the class can implement multiple interfaces.
	 * Note: To implement multiple interfaces, separate them with a comma (see example below).
	 */

	public static void main(String[] args)
	{
		MultipleInheritance mI = new MultipleInheritance();
		mI.animalSound();
		mI.sleep();
	}

}
