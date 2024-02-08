package com.mkpits.methods;

public class MethodDeclaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		MethodDeclaration.getAllData();
		System.out.println("------------------------------------------------------------------------------------------");
		
		// 3. objreference.methodName(); 
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("calling method by reference of object");
		System.out.println();
		MethodDeclaration mD = new MethodDeclaration();
		mD.getAllData();
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println("fjkvnksdvnkj");
	//	System.out.println();		
	}
	public static void getFirstName() {
		String fName = "Vaibhav";
		System.out.println("First Name: "+fName);
	}
	
	public static void getLastName() {
		String lName = "Paidlewar";
		System.out.println("Last Name: "+lName);
	}
	
	public static void getEmail() {
		String eMail = "vaibhavp9890@gmail.com";
		System.out.println("Email: "+eMail);
	}
	
	public static void getMobile() {
		int mobileNo = 1234567890;
		System.out.println("Mobile Number: "+mobileNo);
	}
	
	public static void getGender() {
		char yourGender = 'M';
		System.out.println("Enter Gender: "+yourGender);
	}
	
	public static void getPassword() {
		String passWord = "hmmm_aage_se_Right";
		System.out.println("Enter password: "+passWord);
	}
	
	public static void getAllData() {
		// direct calling
		getFirstName();
		getLastName();
		getGender();
		getMobile();
		getEmail();
		getPassword();
		
	}

	// declare return type if not use void
	// method name - any valid name but not keyword
	// () - for argument
	// {} - method body
	
	
}
