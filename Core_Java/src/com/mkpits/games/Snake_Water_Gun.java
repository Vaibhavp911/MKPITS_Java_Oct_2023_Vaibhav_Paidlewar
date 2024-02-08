package com.mkpits.games;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Random;

public class Snake_Water_Gun {
	private static final String codn [] = {"snake", "water", "gun"};

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		//Snake_Water_Gun sWG = new Snake_Water_Gun();
		
		// generating random of snake , water, gun from system using RANDOM class
		// random object to generate a random integer between 0 and the length of the codn array minus 1.
		// This random number is then used to index into the codn array and retrieve a word
		// the code stores the retrieved word in a variable called sysCodn
		Random random = new Random();
		int word = random.nextInt(codn.length);
		String sysCodn = codn[word];
		//System.out.println(sysCodn);
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		short maximumAttempt;
		for ( maximumAttempt = 1; maximumAttempt < 7; maximumAttempt++)
		{
			// getting input from user.
			System.out.print("Enter your answer, 'snake', 'water' or 'gun' :");
			String userIP = reader.readLine();
			if ( sysCodn.equals(userIP))
			{
				System.out.println("you won Basssi");
				break;
			}
			else
			{
				System.out.println("you loss");
				System.out.println("you have "+(2-maximumAttempt)+" attempts remaining");
			}
			
		
		
		}
	}
	
}
