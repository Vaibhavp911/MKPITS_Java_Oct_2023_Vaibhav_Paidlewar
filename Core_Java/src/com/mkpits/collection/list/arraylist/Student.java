package com.mkpits.collection.list.arraylist;

import java.util.Objects;

public class Student 
{
	private String name;
	private Integer rollNo;
	


	// ModelClassArarayList
	public Student(String name , Integer rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "ModelClassArarayList [Name=" + name + ", Roll_No=" + rollNo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, rollNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && Objects.equals(rollNo, other.rollNo);
	}

	
	
	

}
