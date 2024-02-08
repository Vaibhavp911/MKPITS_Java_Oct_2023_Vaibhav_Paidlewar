package com.mkpits.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchFinally {

	static FileReader fR ;
	public static void main(String[] args)
	{
		try {
			fR= new FileReader("B\\PROGRAMMING_NOTES\\Java\\TestFileIO.txt");
			System.out.print(fR.read());
		} catch (FileNotFoundException e) {
			System.out.println("\t'FileNotFoundException Found'\t");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			}
		finally {
			try {
				fR.close();
				System.out.println("File is closed");
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
