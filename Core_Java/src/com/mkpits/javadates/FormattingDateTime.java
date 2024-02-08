package com.mkpits.javadates;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingDateTime {

	public static void main(String[] args)
	{

		LocalDateTime datetime = LocalDateTime.now();
		System.out.println("Before formatting: " + datetime);
		
		/* The "T" in the example above is used to separate the date from the time.
		 * You can use the DateTimeFormatter class with the ofPattern() method in the same package to format or parse date-time objects.
		 * The following example will remove both the "T" and nanoseconds from the date-time:
		 */
		
		// formatting date and time
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("\ndd-MM-yyyy\nHH:mm:ss");
	    String formattedDate = datetime.format(myFormatObj);
	    System.out.println("After formatting: 'dd-MM-yyyy' : " + formattedDate);

	    DateTimeFormatter myFormatObj1 = DateTimeFormatter.ofPattern("\nyyyy-MM-dd\nHH:mm:ss");
	    String formattedDate1 = datetime.format(myFormatObj1);
	    System.out.println("After formatting: 'yyyy-MM-dd' : " + formattedDate1);
	    
	    DateTimeFormatter myFormatObj2 = DateTimeFormatter.ofPattern("\ndd-MMM-yyyy\nHH:mm:ss");
	    String formattedDate2 = datetime.format(myFormatObj2);
	    System.out.println("After formatting: 'dd-MMM-yyyy' : " + formattedDate2);
	    
	    DateTimeFormatter myFormatObj3 = DateTimeFormatter.ofPattern("\nE, MMM dd yyyy\nHH:mm:ss");
	    String formattedDate3 = datetime.format(myFormatObj3);
	    System.out.println("After formatting: 'E, MMM dd yyyy' : " + formattedDate3);
	    
	    DateTimeFormatter myFormatObj4 = DateTimeFormatter.ofPattern("\nMM-dd-yyyy\nHH:mm:ss");
	    String formattedDate4 = datetime.format(myFormatObj4);
	    System.out.println("After formatting: 'MM-dd-yyyy' :" + formattedDate4);
	    
				
	}

}
