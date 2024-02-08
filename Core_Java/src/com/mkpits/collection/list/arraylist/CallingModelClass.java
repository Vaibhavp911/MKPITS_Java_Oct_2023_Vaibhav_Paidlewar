package com.mkpits.collection.list.arraylist;

import java.util.ArrayList;

public class CallingModelClass {

	public static void main(String[] args)
	{
		ArrayList<Student> studentList1 = new ArrayList<>();
		
		studentList1.add(new Student("Abc", 464435));
		studentList1.add(new Student("Bbc", 464435));
		studentList1.add(new Student("Cbc", 464435));
		studentList1.add(new Student("Dbc", 464435));
		studentList1.add(new Student("Ebc", 464435));
		
		ArrayList<Student> studentList2 = new ArrayList<>();
		
		studentList2.add(new Student("Fbc", 464435));
		studentList2.add(new Student("Gbc", 464435));
		studentList2.add(new Student("Hbc", 464435));
		studentList2.add(new Student("Ibc", 464435));
		studentList2.add(new Student("Jbc", 464435));
		
		
	}

}
