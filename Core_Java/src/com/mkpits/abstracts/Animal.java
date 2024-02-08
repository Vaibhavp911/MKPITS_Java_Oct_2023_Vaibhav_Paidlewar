package com.mkpits.abstracts;

public abstract class Animal
{
	// abstract method are by default are public.
	// if any variable are declared as class variable then it is by default public final
	public abstract void animalSound();
	
	public void sleep()
	{
		System.out.println("Zzz...zzzz..zzz...zzz");
	}
}
