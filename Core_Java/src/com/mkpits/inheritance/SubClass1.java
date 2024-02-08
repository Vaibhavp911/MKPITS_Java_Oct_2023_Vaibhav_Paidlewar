package com.mkpits.inheritance;

import java.io.IOException;

public class SubClass1 extends SuperClassForm1
{
	String gGender;
	long gMobile;
	int gPincode;
	
	public void getMobile(long gMobile) throws NumberFormatException, IOException
	{
		System.out.print("Enter Mobile Number: ");
		gMobile = Long.parseLong(bR.readLine());
		this.gMobile=gMobile;
	}
	
	public void getGender(String gGender) throws IOException
	{
		System.out.print("Enter Gender: ");
		gGender = bR.readLine();
		this.gGender=gGender;
	}
	
	public void getPincode(int gPincode) throws NumberFormatException, IOException
	{
		System.out.print("Enter Pin-Code: ");
		gPincode = Integer.parseInt(bR.readLine());
		this.gPincode=gPincode;
	}
	
	public  void getDetails() throws IOException
	{
		// sub class can access parents class members without any object.
		getFirstName(gFName);
		getLastName(gLName);
		getEmailName(gEName);
		getMobile(gMobile);
		getGender(gGender);
		getPincode(gPincode);
		System.out.println("-----------------------------------------");
		System.out.println("First Name : "+gFName);
		System.out.println("Last Name : "+gLName);
		System.out.println("Email Address : "+gEName);
		System.out.println("Mobile : "+gMobile);
		System.out.println("Gender : "+gGender);
		System.out.println("Pin-Code : "+gPincode);
	}	
}
