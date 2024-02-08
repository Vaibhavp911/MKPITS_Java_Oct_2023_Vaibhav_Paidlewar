package com.mkpits.methods;

public class Method_With_Argument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Method_With_Argument M = new Method_With_Argument();
		M.getDetails(1028);	// calling 
		// M.getDetails( Argument );
	}

	// public void getDetails( parameter )  <---- called 
	public void getDetails(int i) {
		// TODO Auto-generated method stub
		// 'int i' scope is with in this method.
		System.out.println(" ");
		System.out.println(i);
		
	}

}
