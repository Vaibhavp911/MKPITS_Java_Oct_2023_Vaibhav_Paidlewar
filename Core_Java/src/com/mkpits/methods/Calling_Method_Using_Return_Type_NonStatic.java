package com.mkpits.methods;

public class Calling_Method_Using_Return_Type_NonStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calling non static in static method is not possible you have to call by creating object
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("calling method by reference of object");
		System.out.println();
		Calling_Method_Using_Return_Type_NonStatic cMURTNS = new Calling_Method_Using_Return_Type_NonStatic();
		cMURTNS.getAllData();
		System.out.println("-------------------------------------------------------------------------------------------");

	}

	public String getFirstName() {
		String fName = "Vaibhav";
		//System.out.println("First Name: "+fName);
		return fName;
	}
	
	public String getLastName() {
		String lName = "Paidlewar";
		//System.out.println("Last Name: "+lName);
		return lName;
	}
	
	public String getEmail() {
		String eMail = "vaibhavp9890@gmail.com";
		//System.out.println("Email: "+eMail);
		return eMail;
	}
	
	public int getMobile() {
		int mobileNo = 1234567890;
		//System.out.println("Mobile Number: "+mobileNo);
		return mobileNo;
	}
	
	public char getGender() {
		char yourGender = 'M';
		//System.out.println("Enter Gender: "+yourGender);
		return yourGender;
	}
	
	public String getPassword() {
		String passWord = "hmmm_aage_se_Right";
		//System.out.println("Enter password: "+passWord);
		return passWord;
	}
	
	public void getAllData() {
		// direct calling
		System.out.println(getFirstName());
		System.out.println(getLastName());
		System.out.println(getGender());
		System.out.println(getMobile());
		System.out.println(getEmail());
		System.out.println(getPassword());
	}
}
