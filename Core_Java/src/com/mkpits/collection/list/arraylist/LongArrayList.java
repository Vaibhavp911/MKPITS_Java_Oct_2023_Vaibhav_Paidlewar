package com.mkpits.collection.list.arraylist;

import java.util.ArrayList;

public class LongArrayList {

	public static void main(String[] args) 
	{
		ArrayList<Long> longAL = new ArrayList<>();
		longAL.add(31461320146l);
		longAL.add(32461320146l);
		longAL.add(33461320146l);
		longAL.add(34461320146l);
		longAL.add(35461320146l);
		longAL.add(36461320146l);
		longAL.add(37461320146l);
		longAL.add(38461320146l);
		longAL.add(39461320146l);
		longAL.add(40461320146l);
		longAL.add(41461320146l);
		longAL.add(42461320146l);
		
		System.out.println(longAL.size());
		System.out.println("---------");
		// using for each to print the data of ArrayList 'longAL'
		for (Long lonG : longAL) {
			System.out.println(lonG);
		}
		
		System.out.println("-----------");
		// using for iterate over an index.
		for (int i = 0; i < longAL.size(); i++) {
			System.out.println(longAL.get(i));
		}
	}
	

}
