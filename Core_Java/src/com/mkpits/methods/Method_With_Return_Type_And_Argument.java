package com.mkpits.methods;

public class Method_With_Return_Type_And_Argument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// non-static method must be called with an object of the class

		Method_With_Return_Type_And_Argument T = new Method_With_Return_Type_And_Argument();
		// creating new variable too print
		String uDetails = T.getDetails(1, 100000);
		// printing the method using variable
		System.out.println(uDetails);
	}
// method is non static 
	private String getDetails(int id, int salary) {
		// TODO Auto-generated method stub
		double salary_With_Incentives = salary +  (salary*0.1);
		// variable "details" has string in it so the datatype will be String
		String details = "Employee ID : " + id + ", Employee Salary With Incentives : " + salary_With_Incentives;
		// return is String
		return details;
		
	}

}
