package com.mkpits.games;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Guessing_Random_Number {

	short pin, uGuess;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		Guessing_Random_Number gRN = new Guessing_Random_Number();
		gRN.Random_Number();
		gRN.userGuess();
		gRN.guessingAttempts();
		
	}

	public void Random_Number()
	{
		short pin = (short)Math.floor(Math.random()*100);
		this.pin = pin;
	}
	
	public void userGuess() throws NumberFormatException, IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter System or user Number:");
		short uGuess =  Short.parseShort(br.readLine());
		this.uGuess = uGuess;
		
	}
	
	
	public void guessingAttempts() throws NumberFormatException, IOException
	{
		int maxAttempts;
		System.out.println(pin);
		for (maxAttempts = 1; maxAttempts < 10; ++maxAttempts)
		{
			if (pin>0 && pin<100) 
			{
				
				if (uGuess > pin)
					{
						System.out.println("Number is Greater, Enter Lesser Number!");
					}
				if (uGuess < pin)
					{
						System.out.println("Number is Lesser, Enter Greater Number!");
					}
				if (uGuess == pin)
					{
						System.out.println("User Entered Number is Equals to System Generated Random Number!");
						break;
					}
					userGuess();
				if (maxAttempts==9)
					{
						System.out.println("Out Of Attempt");
					}
				
			}	
		}
		
		
	}
}
