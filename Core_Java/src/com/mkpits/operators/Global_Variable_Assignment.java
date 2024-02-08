package com.mkpits.operators;

public class Global_Variable_Assignment {

	int A = 60; // non-static variable it should be called using object direct calling not possible.
	static int B = 70; // static variable can be called directly anywhere in these code.
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Direct Calling Of Global Static variable, B: "+B);
		Global_Variable_Assignment gva = new Global_Variable_Assignment();
		System.out.println("Calling of Non-Static Variable 'A' Using Object, A: "+gva.A);
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("PRE-INCREMENT");
		gva.preIncrementA();
		gva.preIncrementReturnA();
		gva.preIncrementA();
		gva.preIncrementReturnA();
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("POST-INCREMENT");
		gva.postIncrementA();
		gva.postIncrementReturnA();
		gva.postIncrementA();
		gva.postIncrementReturnA();
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("PRE-DECREMENT");
		gva.preDecrementA();
		gva.preDecrementReturnA();
		gva.preDecrementA();
		gva.preDecrementReturnA();
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("POST-DECREMENT");
		gva.postDecrementA();
		gva.postDecrementReturnA();
		gva.postDecrementA();
		gva.postDecrementReturnA();
	}
	
	
	public void preIncrementA() {
		++A;
		System.out.println(A);
	}
	
	public int preIncrementReturnA() {
		++A;
		System.out.println(A);
		return A;
	}

	public void postIncrementA() {
		A++;
		System.out.println(A);
	}
	
	public int postIncrementReturnA() {
		A++;
		System.out.println(A);
		return A;
	}
	
	public void preDecrementA() {
		// TODO Auto-generated method stub
		A--;
		System.out.println(A);
	}
	
	public int preDecrementReturnA() {
		// TODO Auto-generated method stub
		A--;
		System.out.println(A);
		return A;
	}
	
	public void postDecrementA() {
		// TODO Auto-generated method stub
		A--;
		System.out.println(A);
	}

	public int postDecrementReturnA() {
		// TODO Auto-generated method stub
		A--;
		System.out.println(A);
		return A;
	}

	
}
