package com.mkpits.interfaces;

public class CowSound implements AnimalI {

	@Override
	public void animalSound()
	{
		System.out.println("cow says HambaaAAAAA");
	}

	@Override
	public void sleep()
	{
		System.out.println("zzz..zzz..z.zz.z.z");
	}

}
