package com.mkpits.iofile;

import java.io.File;

public class FileListDemo {

	public static void main(String[] args)
	{
		File f = new File("B:\\MKPITS_workspace\\MKPITS_Java_Oct_2023_Vaibhav_Paidlewar");
		String[] str = f.list();
		
		for (int i = 0; i < str.length; i++)
		{
			System.out.println(str[i]);
		}
		System.out.println("-------------------------------------------------------------------");
		//
		// using File class method
		for (int i = 0; i < str.length; i++)
		{
			File f1 = new File(f, str[i]);
			
			if (f1.isDirectory())
			{
				System.out.println("'"+f1.getName()+"' is a directory");
				System.out.println("its  path is : "+f1.getPath());
				System.out.println("-------------------------------------------------------------------");
			}
			else if (f1.isFile())
			{
				System.out.println("'"+f1.getName()+"' is a File");
				System.out.println("its  path is : "+f1.getPath());
				System.out.println("-------------------------------------------------------------------");
			}
		}
	}

}
