package com.mkpits.operators;

public class Unary_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ++(Increment)
		// --(Decrement)

		Unary_Operator uO = new Unary_Operator();
		uO.opIncrement();
		uO.opDecrement();
		
	}
	
	public void opDecrement() {
		// TODO Auto-generated method stub
		int number = 55;
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Decrement Operator (--) ----->");
		number--;
		System.out.println("post-decrement: "+number);	//print 54 , memory 54
		--number;
		System.out.println("pre-decrement: "+number);	// print 53 , memory 53
		--number;
		System.out.println("pre-decrement: "+number);	// print 52 , memory 52
		System.out.println(number--);	// print 52 , memory 51
		System.out.println(number--);	// print 51 , memory 50
		System.out.println(--number);	// print 49 , memory 49
		System.out.println(--number);	// print 48 , memory 48
		System.out.println(--number);	// print 47 , memory 47
		System.out.println(number);		// print 47
		System.out.println("------------------------------------------------------------------------------------------");
	}

	public void opIncrement() {
		int number = 55;
		System.out.println("------------------------------------------------------------------------------------------");
		System.out.println("Increment Operator (++) ----->");
		number++;
		System.out.println("post-increment: "+number);
		++number;
		System.out.println("pre-increment: "+number);
		++number;
		System.out.println("pre-increment: "+number);
		System.out.println(number++);	// print 58 , memory 59
		System.out.println(number++);	// print 59 , memory 60
		System.out.println(++number);	// print 61 , memory 62
		System.out.println(++number);	// print 62 , memory 63
		System.out.println(++number);	// print 63 , memory 63
		System.out.println(number);		// print 63
		System.out.println("------------------------------------------------------------------------------------------");
	}
	
	
	

}
