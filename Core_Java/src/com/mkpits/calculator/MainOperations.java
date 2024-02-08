package com.mkpits.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainOperations
//class is still in devloping phase
{
	static BufferedReader input;
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		input = new BufferedReader(new InputStreamReader(System.in));
		// creating object to call other classes.
		//MainOperations mO = new MainOperations();
		System.out.println("\t\t\tCalculator");
		System.out.println();
		System.out.print("Enter digit for type of Operation : ");
		int opDigit= Integer.parseInt(input.readLine());
		while (opDigit>0&&opDigit<=5)
		{
			switch (opDigit) {
			case 1:
				Addition aD = new Addition();
				aD.getAddition();
				break;
				
			case 2:
				Subtraction sB = new Subtraction();
				sB.getSubtraction();
				break;
				
			case 3:
				Multiplication mP = new Multiplication();
				mP.getMultiplication();
				break;
				
			case 4:
				Division dV = new Division();
				dV.getDivision();
				break;
				
			case 5:
				Trignometric tG = new Trignometric();
				tG.getTrignometric();
				break;

			default:
				break;
			}
			
		}
		
	}

}
