package com.mkpits.controlflowstructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfElseCFS {

	BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		IfElseCFS iFCFS = new IfElseCFS();
		System.out.print("Enter Value A: ");
		int a = Integer.parseInt(iFCFS.bR.readLine());
		System.out.print("Enter Value B: ");
		int b = Integer.parseInt(iFCFS.bR.readLine());
		
		if (a==b) {
			System.out.println("integer 'a' is equals to integer 'b'");
		} else {
			System.out.println("integer 'a' is not equal to integer 'b'");
		}
	}

}
