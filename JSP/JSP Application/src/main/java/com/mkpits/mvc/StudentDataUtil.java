package com.mkpits.mvc;

import java.util.ArrayList;
import java.util.List;
public class StudentDataUtil {

	public static List<Student> getStudents(){
		//create an empty list
		List<Student> students = new ArrayList<>();
		
		// add data
		students.add(new Student("Vaibhav", "Paidlewar","vaibhav@gmail.com"));
		students.add(new Student("Vaibha", "Paidlewa","vaibhav@gmai.com"));
		students.add(new Student("Vaibh", "Paidlew","vaibhav@gma.com"));
		students.add(new Student("Vaib", "Paidle","vaibhav@gm.com"));
		students.add(new Student("Vai", "Paidl","vaibhav@.com"));
		
		// return list
		return students;
	}
}
