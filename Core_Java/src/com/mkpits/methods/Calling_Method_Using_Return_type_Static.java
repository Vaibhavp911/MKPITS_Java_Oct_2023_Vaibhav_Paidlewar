package com.mkpits.methods;

public class Calling_Method_Using_Return_type_Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// calling static method in static method can be easily called
		// but calling non static in static method is not possible you have to call by creating object.
		// Static methods can only be called directly (without using the class name) from within the class they are declared, 
		// whereas non-static methods can be called from other classes
		// calling methods using different ways.
				// 1. Direct Access
				System.out.println("------------------------------------------------------------------------------------------");
				System.out.println("calling method by Direct Access");
				System.out.println();
				getAllData();
				System.out.println("-------------------------------------------------------------------------------------------");

				
				// 2. className.methodName();
				System.out.println("------------------------------------------------------------------------------------------");
				System.out.println("calling method by reference of class");
				System.out.println();
				Calling_Method_Using_Return_type_Static.getAllData();
				System.out.println("------------------------------------------------------------------------------------------");
				
				// 3. objreference.methodName(); 
				System.out.println("-------------------------------------------------------------------------------------------");
				System.out.println("calling method by reference of object");
				System.out.println();
				Calling_Method_Using_Return_type_Static cMURT = new Calling_Method_Using_Return_type_Static();
				cMURT.getAllData();
				System.out.println("-------------------------------------------------------------------------------------------");
			//	System.out.println();		
	}
	
	public static String getFirstName() {
		String fName = "Vaibhav";
		//System.out.println("First Name: "+fName);
		return fName;
	}
	
	public static String getLastName() {
		String lName = "Paidlewar";
		//System.out.println("Last Name: "+lName);
		return lName;
	}
	
	public static String getEmail() {
		String eMail = "vaibhavp9890@gmail.com";
		//System.out.println("Email: "+eMail);
		return eMail;
	}
	
	public static int getMobile() {
		int mobileNo = 1234567890;
		//System.out.println("Mobile Number: "+mobileNo);
		return mobileNo;
	}
	
	public static char getGender() {
		char yourGender = 'M';
		//System.out.println("Enter Gender: "+yourGender);
		return yourGender;
	}
	
	public static String getPassword() {
		String passWord = "hmmm_aage_se_Right";
		//System.out.println("Enter password: "+passWord);
		return passWord;
	}
	
	public static void getAllData() {
		// direct calling
		System.out.println(getFirstName());
		System.out.println(getLastName());
		System.out.println(getGender());
		System.out.println(getMobile());
		System.out.println(getEmail());
		System.out.println(getPassword());
	}

	// declare return type if not use void
	// method name - any valid name but not keyword
	// () - for argument
	// {} - method body
	
	
}
