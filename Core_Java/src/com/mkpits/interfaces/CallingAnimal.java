package com.mkpits.interfaces;

public class CallingAnimal {

	public static void main(String[] args)
	{
		CowSound cS = new CowSound();
		cS.animalSound();
		cS.sleep();
		Birds bD = new Birds();
		bD.animalSound();
		bD.sleep();
	}

}
