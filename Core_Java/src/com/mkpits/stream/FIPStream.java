package com.mkpits.stream;

import java.io.FileInputStream;
import java.io.IOException;

public class FIPStream {

	public static void main(String[] args) throws IOException
	{
		FileInputStream fips = new FileInputStream("B:\\BOOKs\\FileOutputStream_Test.txt");
		/*
		 * A FileInputStream obtains input bytes from a File in a file System.
		 * What files are available,depends on the host environment.
		 * FileInputStream is meant for reading streams of low bytes such as image data
		 */
		// creating variable to take value for printing data.
		byte dataCollector =0 ;
		
		while ((dataCollector = (byte) fips.read()) != -1)
		{
			/* Reads a byte of data from this input stream,
			 * This method blocks if no input is yet available.
				Overrides: read() in InputStream
				Returns:the next byte of data, or -1 if the end of the file is reached.
			 */
			System.out.print((char)dataCollector);
			//type-casting to convert char as date collected in byte from the file.
		}
		// Reads a byte of data from this input stream. This method blocksif no input is yet available.
		// Overrides: read() in InputStream
		// Returns:the next byte of data, or -1 if the end of thefile is reached.
		fips.close();
	}

}
