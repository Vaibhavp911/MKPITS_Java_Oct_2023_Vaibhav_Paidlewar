package com.mkpits.controlflowstructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Table_For_Loop {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 'n' to print its TABLE ");
		int n = Integer.parseInt(reader.readLine());
		for (int i = 1; i <= 10; i++) {
			int t = n*i;
			System.out.println(n+" * "+i+" = "+t);
		}
	}

}
