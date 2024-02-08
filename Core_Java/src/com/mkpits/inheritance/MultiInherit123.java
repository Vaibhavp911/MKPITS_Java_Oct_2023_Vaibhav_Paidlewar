package com.mkpits.inheritance;

public class MultiInherit123
{
	public static void main(String args[])
	{
		MultiDemo13 md=new MultiDemo13();
		md.getData(85,15);
		md.add();	// Grand-Father class
		md.sub();	// Father Class
		md.mul();	// Child Class
	}

}
