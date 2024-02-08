package com.mkpits.collection.map;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CreatingMapObjects {

	public static void main(String[] args) 
	{
// Map is an interface, objects cannot be created of the type map.
// We always need a class that extends this map in order to create an object.
		Map<String, Integer> map1 = new HashMap<>();
		Map<String, Integer> map2 = new TreeMap<>();
		Map<String, Integer> map3 = new EnumMap(map1);
		
		try
		{
		System.out.println(map1);
		System.out.println(map2);
		System.out.println(map3);
		}
		catch(Exception e)
		{
			System.out.println("Error Occured");
			e.printStackTrace();
		}
	}

}
