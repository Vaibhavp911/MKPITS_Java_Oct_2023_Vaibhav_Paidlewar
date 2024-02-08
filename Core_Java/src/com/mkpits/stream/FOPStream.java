package com.mkpits.stream;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FOPStream {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;

		System.out.println("Taking input for a file:");
		String writer = br.readLine();
		// to take continuous data from input even after clicking 'ENTER Button'
		// it will  append the string 
		writer = writer + "\n";
		// creating file using class FileOutputStream.
		FileOutputStream fops = new FileOutputStream("B:\\BOOKs\\FileOutputStream_Test.txt",true);
		// taking data character from user and converting it to a byte
		byte data[] = writer.getBytes();
		
		fops.write(data);
		fops.close();
		System.out.println("Data entered in a file");
	}

}
