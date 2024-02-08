package com.mkpits.userinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class R_Form_Method {
	
	long gMoblie;
	byte gAge;
	char gGender;
	String fName,lName,gEmail,gPassword,gCP;
	
	BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
	public void getFname() throws IOException
	{
		System.out.print("Enter First Name: ");
		String fName = bR.readLine();
		this.fName=fName;
	}
	
	public void getLname() throws IOException
	{
		System.out.print("Enter Last Name: ");
		String lName = bR.readLine();
		this.lName = lName;
	}
	
	public void getAge() throws IOException
	{
		System.out.print("Enter Age: ");
		String gAge = bR.readLine();
		this.gAge = Byte.parseByte(gAge);
	}
	
	public void getGender() throws IOException
	{
		System.out.print("Enter Gender: ");
		String gGen = bR.readLine();
		this.gGender = gGen.charAt(0);	
	}
	public void getMobile() throws IOException
	{
		System.out.print("Enter Mobile Number: ");
		String gMobile = bR.readLine();
		this.gMoblie = Long.parseLong(gMobile);
	}
	
	public void getEmail() throws IOException
	{
		System.out.print("Enter Email ID: ");
		String gEmail = bR.readLine();
		this.gEmail= gEmail;
	}
	
	public void getPassword() throws IOException
	{
		System.out.print("Set Password: ");
		String gPassword = bR.readLine();
		this.gPassword= gPassword;
	}
	
	public void getConfirmPassword() throws IOException
	{
		System.out.print("Confirm the Password: ");
		String gCP = bR.readLine();
		this.gCP= gCP;
	}
	
	public void getFormDetails()
	{
		System.out.println("**********************************************************************************");
		System.out.println("First Name : "+fName);
		System.out.println("Last Name : "+lName);
		System.out.println("Age : "+gAge);
		System.out.println("Gender : "+gGender);
		System.out.println("Mobile : "+gMoblie);
		System.out.println("Email : "+gEmail);
		System.out.println("Set Password: "+gPassword);
		System.out.println("Cofirm the Password : "+gCP);
		System.out.println("**********************************************************************************");
	}
}
//ddfg
