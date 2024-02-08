package com.mkpits.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileException {

	public static void main(String[] args)
	{
		FileReader fR ;
		try {
			fR= new FileReader(" B\\PROGRAMMING_NOTES\\Java\\name.txt");
			System.out.println(fR.read());
		}
		catch (FileNotFoundException e)
		{
			System.out.println("    'FileNotFoundException Found'    ");
			e.printStackTrace();
		} catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
