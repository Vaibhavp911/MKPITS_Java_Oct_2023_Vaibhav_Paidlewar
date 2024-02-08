package com.mkpits.methods;

import java.util.Scanner;

public class Price_And_Discount_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//double tP,dP;
		System.out.println("this is example 1 of method with argument and return type");
		Price_And_Discount_Method mW = new Price_And_Discount_Method();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the amount of product: ");
		double tP = s.nextDouble();
		System.out.println("Enter the percentage of discount applicable: ");
		double dP = s.nextDouble();
		System.out.println(mW.payBill(tP , dP));
		
	}
	
	public double payBill(double totalPrice, double discountPercentage) {
		System.out.println("Calculating final amount to be paid.....");
		double priceAfterDiscount = totalPrice * (1 - (discountPercentage / 100));
		return priceAfterDiscount;
	}

}
