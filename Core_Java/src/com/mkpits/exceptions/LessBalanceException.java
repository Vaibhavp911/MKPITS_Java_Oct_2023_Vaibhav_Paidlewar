package com.mkpits.exceptions;

public class LessBalanceException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int amount;

	public LessBalanceException() {
		System.out.println("Default Constructor Called");
	}

	public LessBalanceException(int amount) {
		this.amount = amount;

	}

	/*
	 * toString() method created by
	 * right-click-->source--> click generate toString()
	 */
	@Override
	public String toString() {
		return "You Dont Have Sufficient Balance Your Balance is " + amount;
	}

}
