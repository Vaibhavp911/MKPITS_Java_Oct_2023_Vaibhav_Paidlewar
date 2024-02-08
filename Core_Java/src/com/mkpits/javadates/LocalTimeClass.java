package com.mkpits.javadates;

import java.time.LocalTime;

public class LocalTimeClass {

	public static void main(String[] args)
	{
		/*	LocalTime is an immutable date-time object that represents a time,
		 * often viewed as hour-minute-second. Time is represented to nanosecond precision.
		 * For example, the value "13:45.30.123456789" can be stored in a LocalTime.
		 * 
		 * This class does not store or represent a date or time-zone.
		 * 
		 * This class is immutable and thread-safe.
		 */
		// 'now();' Obtains the current time from the system clock in the default time-zone.
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		int gethour = time.getHour();
		System.out.println(" Gets the hour-of-day field.\r\n"
				+ "Returns: the hour-of-day, from 0 to 23: "+gethour);
		
		int getminute = time.getHour();
		System.out.println(" Gets the minute-of-hour field.\r\n"
				+ "Returns: the minute-of-hour, from 0 to 59: "+getminute);
		
		int getsecond = time.getSecond();
		System.out.println(" Gets the second-of-minute field.\r\n"
				+ "Returns: the second-of-minute, from 0 to 59: "+getsecond);
	}

}
