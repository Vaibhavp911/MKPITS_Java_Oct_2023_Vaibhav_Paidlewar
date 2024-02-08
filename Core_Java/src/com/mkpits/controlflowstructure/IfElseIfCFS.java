package com.mkpits.controlflowstructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfElseIfCFS {

	BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		IfElseIfCFS iFE = new IfElseIfCFS();
		System.out.print("Enter Value A: ");
		int a = Integer.parseInt(iFE.bR.readLine());
		System.out.print("Enter Value B: ");
		int b = Integer.parseInt(iFE.bR.readLine());
		if (a>b) {
			System.out.println("integer 'a' is greater than integer 'b'");
		} 
		else if (a<b)
		{	
			System.out.println("integer 'b' is greater than integer 'a'");
		} 
		else
		{
			System.out.println("integer 'a' is equals to integer 'b'");
		}
	}

}
