package com.mkpits.interfaces;

public class Birds implements AnimalI
{

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
