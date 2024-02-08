package com.mkpits.overloading;

public class Method_Overloading {

	// When more than one method are defined using same name but by passing different types
	// & different no. of arguments it is called method overloading
	
	// It is used to implement static/compile/time polymorphism in java.
	
	// Note:-Return type does not play any important role in method overloading
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Employee Details");
		Method_Overloading mO = new Method_Overloading();
		mO.getDetails();
		mO.getDetails(25676);
		mO.getDetails("Vaibhav Paajiiii..");
		mO.getDetails('M');
		mO.getDetails(true);
		mO.getDetails(9373171906l, 1000000);
	}

	public void getDetails()
	{
		System.out.println("Method with No Argument Passed");
		System.out.println("------------------------------------------------------------------");
	}
	
	public int getDetails(int id)
	{
		System.out.println("Method with one Integer Argument: ");
		System.out.println("Employee Id: "+id);
		System.out.println("------------------------------------------------------------------");
		return id;
	}
	
	public String getDetails(String employeeName) 
	{
		System.out.println("Method with one String Argument: ");
		System.out.println("Employee Name: "+employeeName);
		System.out.println("------------------------------------------------------------------");
		return employeeName;
	}
	
	public char getDetails(char employeeGender)
	{
		System.out.println("Method with one Character Argument: ");
		System.out.println("Employee Gender: "+employeeGender);
		System.out.println("------------------------------------------------------------------");
		return employeeGender;
	}
	
	public boolean getDetails(boolean employeeWorkStatus)
	{
		System.out.println("Method with one boolean Argument: ");
		if (true) {
			System.out.println("Permanent Employee");
			System.out.println("------------------------------------------------------------------");
		} else {
			System.out.println("Temprory Employee");
			System.out.println("------------------------------------------------------------------");
		}
		return employeeWorkStatus;
	}
	
	public String getDetails ( long employeeMobile , int employeeSalary)
	{
		System.out.println("Method with Two Integer Argument: ");
		System.out.println("Employee Mobile: "+employeeMobile);
		System.out.println("Employee Salary: "+employeeSalary);
		System.out.println("------------------------------------------------------------------");
		String employee_Mob_Sal = " "+employeeMobile+" "+employeeSalary;
		return employee_Mob_Sal;
	}
	
}
