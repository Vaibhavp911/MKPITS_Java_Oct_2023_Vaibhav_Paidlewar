package com.mkpits.abstracts;

public class CallingAnimal {

	public static void main(String[] args)
	{
		// calling sub-classes using their object.
		// call is going from Animal() class to each Sub-classes where abstract method body is present.
		// means we can override abstract method using multiple sub-classes.
		// Animal am = new Animal();
		
		Dog d = new Dog();
		d.sleep();
		d.animalSound();
		Cat c = new Cat();
		// c.sleep();
		c.animalSound();
		Lion li =  new Lion();
		li.animalSound();
		Goat gt = new Goat();
		gt.animalSound();
	}

}
