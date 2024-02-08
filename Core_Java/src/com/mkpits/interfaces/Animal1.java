package com.mkpits.interfaces;

public interface Animal1
{
	// abstract method are by default are public.
			// if any variable are declared as class variable then it is by default public final
		
		/*
		 * interface is a completely "abstract class" 
		 * To access the interface methods, the interface must be "implemented"
		 * (kind a like inherited) by another class with the implements keyword.
		 * Like abstract classes, interfaces cannot be used to create objects
		 * Interface methods do not have a body
		 * Interface methods are by default abstract and public
		 * Interface attributes are by default public, static and final
		 * interface cannot contain a constructor (as it cannot be used to create objects).
		 * To achieve security - hide certain details and only show the important details of an object (interface).
		 * Java does not support "multiple inheritance" (a class can only inherit from one superclass).
		 * However, it can be achieved with interfaces, because the class can implement multiple interfaces.
		 * Note: To implement multiple interfaces, separate them with a comma (see example below).
		 */
		public void animalSound();
		/*
		 	public void sleep() 
		 	{
		 	you cannot create method body in interface class methods.
			}
		*/
		public void sleep();
}
