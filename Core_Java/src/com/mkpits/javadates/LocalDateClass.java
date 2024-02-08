package com.mkpits.javadates;
// importing Time package
import java.time.LocalDate;
public class LocalDateClass {

	public static void main(String[] args)
	{
		/*
		 * Java does not have a built-in Date class, but we can import the java.time package
		 * To work with the date and time API. 
		 * The package includes many date and time classes.
		 * 
		 * LocalDate	Represents a date (year, month, day (yyyy-MM-dd))
		 * 
		 * To display the current date, import the java.time.LocalDate class, and use its now() method:
		 */
		
		LocalDate date = LocalDate.now();
		System.out.println(date);

	}
}
