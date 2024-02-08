package com.mkpits.exceptions;

public class MultipleCatch {

	public static void main(String[] args)
	{
		int divident = 9 ;
		int divisor = 0;
		
		try {
			System.out.println(divident/divisor);
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		catch (IndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		catch (NullPointerException e)
		{
			e.printStackTrace();
		}
		catch (ArithmeticException e)
		{
			System.out.println("Arithmatic Exception Detected");
			e.printStackTrace();
		}
		
		/*
		 * can also be done as below.
		 	catch (IndexOutOfBoundsException | NullPointerException | ArithmeticException e)
		{
			e.printStackTrace();
		}
		 */
	}

}
