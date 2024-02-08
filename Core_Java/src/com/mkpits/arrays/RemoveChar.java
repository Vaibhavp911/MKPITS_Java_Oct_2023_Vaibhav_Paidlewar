package com.mkpits.arrays;

public class RemoveChar {

	public static void main(String[] args)
	{
		/*String name = "vaibhav paidlewar";
		char ch[] = new char[name.length()];
		
		for (int outerLoop = 0; outerLoop < ch.length; outerLoop++)
		{
			for (int innerLoop = 0; innerLoop < ch.length; innerLoop++)
			{
				if (name.charAt(outerLoop) == name.charAt(innerLoop))
				{
					name.charAt(innerLoop)=RemoveChar;
				}
				
			}
		}
		*/
		double a = 1;
		//double sixtyDeg = Math.asin(90.000000);
		System.out.println(Math.asin(a));
		
		String name[] = {"vaibhav paidlewar"};
		System.out.println("s");
		for (int outerLoop = 0; outerLoop < name.length; outerLoop++)
		{
			for (int innerLoop = outerLoop+1; innerLoop < name.length; innerLoop++)
			{
				if (name[outerLoop]==name[innerLoop])
				{

					System.out.println(outerLoop);
				}
				
			}
		}
	}
}

