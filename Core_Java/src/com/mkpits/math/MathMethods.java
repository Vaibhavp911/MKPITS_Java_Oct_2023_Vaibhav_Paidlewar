package com.mkpits.math;

public class MathMethods {

	public static void main(String[] args)
	{
		double ad= 25.2655264;
		double bd = 0.00;
		double cd = -415.59461;
		System.out.println("USING METHOD Math.abs(double)");
		System.out.println("Math.abs() return absolute value of double: "+Math.abs(ad));
		/*	Returns the absolute value of a double value. If the argument is not negative, the argument is returned.
		 * If the argument is negative, the negation of the argument is returned.
		 *	Special cases:
		 *	If the argument is positive zero or negative zero, the result is positive zero.
		 *	If the argument is infinite, the result is positive infinity.
		 *	If the argument is NaN, the result is NaN. 	*/
		System.out.println("Math.abs() return absolute value of double: "+Math.abs(bd));
		System.out.println("Math.abs() return absolute value of double: "+Math.abs(cd));
		System.out.println("------------------------------------------");
		
		System.out.println("USING METHOD Math.absExact(int//long)");
		int  ai =252; 
		System.out.println("Math.absExact() "+Math.absExact(ai));
		
		System.out.println("------------------------------------------");
		System.out.println("USING METHOD Math.acos()");
		System.out.println("Meth.acos()"+Math.acos(0));
		System.out.println("------------------------------------------");
		
		System.out.println("USING METHOD Math.asin()");
		double angle = 90;  // Angle in degrees
        double angleInRadians = Math.toRadians(angle);
        double result = Math.asin(Math.sin(angleInRadians));
        System.out.println("Math.asin()"+result);
        
        System.out.println("------------------------------------------");
        int aad =252;
        System.out.println("Math.addExact()"+Math.addExact( ai,aad));
        System.out.println("------------------------------------------");
        
        
        System.out.println("USING METHOD Math.cbrt()");
        System.out.println("Math.cbrt()"+Math.cbrt(aad));
        System.out.println("------------------------------------------");
        
        System.out.println("USING METHOD Math.cos(90.000)");
        System.out.println("Math.cos(90.000)"+Math.cos(90.000000000));
        System.out.println("------------------------------------------");
        System.out.println("USING METHOD Math.cbrt()");
        System.out.println("Math.decrementExact(aad), add= 252---->"+Math.decrementExact(aad));
        
        
	}

}
