package com.mkpits.controlflowstructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ternary_Operator {

	

	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		// TODO Auto-generated method stub

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		// only use in main thats why declare it inside main
		
		System.out.print("Enter A ");
		int a = Integer.parseInt(reader.readLine());

		System.out.print("Enter B ");
		int b = Integer.parseInt(reader.readLine());
		
		//System.out.print("Enter C ");
		//int c = Integer.parseInt(reader.readLine());
		
		// consist of ? and :. Since it required three operand therefore called Ternary
		
		boolean c = a>b;
		System.out.println( c ? " 'a' is greater than 'b' " : " 'b' is greater than 'a' ");
		
		
	}

}
