package com.mkpits.inheritance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SuperClassForm1 
{
	/*	INHERITANCE
	 *   Advantages :-
	 *  •	Reusability of existing code.
		•	Reduce code redundancy
		•	Save the memory space because same code can be reuse.
		•	It save the timing to rewrite same code.

	 */
	String gFName,gLName,gEName;
	BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
	
	public void getFirstName(String gFName) throws IOException
	{
		System.out.print("Enter First Name: ");
		gFName = bR.readLine();
		this.gFName=gFName;
	}
	
	public void getLastName(String gLName) throws IOException
	{
		System.out.print("Enter Last Name: ");
		gLName = bR.readLine();
		this.gLName=gLName;
	}
	
	public void getEmailName(String gEName) throws IOException
	{
		System.out.print("Enter Email Address: ");
		gEName = bR.readLine();
		this.gEName=gEName;
	}
}
