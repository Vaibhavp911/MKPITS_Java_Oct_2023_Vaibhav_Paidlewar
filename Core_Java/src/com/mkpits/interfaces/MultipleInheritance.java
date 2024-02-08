package com.mkpits.interfaces;

public class MultipleInheritance implements AnimalI, Animal1
{
	/*
	 * Java does not support "multiple inheritance" (a class can only inherit from one superclass).
	 * However, it can be achieved with interfaces, because the class can implement multiple interfaces.
	 * Note: To implement multiple interfaces, separate them with a comma (see example below).
	 */
	@Override
	public void animalSound()
	{
		System.out.println("Birds Chipppersss");
	}

	@Override
	public void sleep()
	{
		System.out.println("zzz.zzz.zzz.zz.z");
	}

}
