package com.mkpits.controlflowstructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class While_Loop_Banking {

	String name,mobile,age,gender,email;
	int accountNumber;
	double balance;
	double gWithdraw;
	double gDeposit;
	static BufferedReader reader;	// to call reader in every class thats why to declare it static.
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		While_Loop_Banking loop = new While_Loop_Banking();
		System.out.println("\t\twel-Come");
		System.out.println("LAKSHMI CHIT FUND");
		
		reader = new BufferedReader(new InputStreamReader(System.in));
		char ch = 'y';
		
		while (ch == 'y' || ch == 'Y') {
			
			System.out.println("Enter Your Choice \n1.Create Account\n2.Deposit"
					+ "\n3.Withdraw\n4.Check Balance\n5.Account Details");
			int choice = Integer.parseInt(reader.readLine());
			
			switch(choice) {
			case 1:
				loop.createAccount();
				break;
			case 2:
				loop.deposit();
				break;
			case 3:
				loop.withdraw();
				break;
			case 4:
				loop.balance();
				//System.out.println("Your Balance is :-"+loop.balance);
				break;
			case 5:
				loop.accountDetails();
				break;
			default:
					System.out.println("Invalid Choice");
					break;
			}
			
			System.out.println("Do you wish to continue Y/N");
			ch = (char) reader.read();
			reader.readLine();
		}

	}
	
	private void balance() {
		this.balance = gDeposit - gWithdraw;
		System.out.println("Your Balance is :- "+this.balance);
	}

	private void accountDetails() {
		
		System.out.println("Account Holder Name :-"+name);
		System.out.println("Account Number :-"+accountNumber);
		System.out.println("Account Holder Email :-"+email);
		System.out.println("Account Holder Mobile :-"+mobile);
		System.out.println("Account Holder Age :-"+age);
		System.out.println("Account Holder Gender :-"+gender);
		System.out.println("Account Holder Balance :- "+balance);
		
	}

	private void withdraw() throws NumberFormatException, IOException {
		System.out.print("Enter Amount to WithDraw: ");
		//double gWithdraw = Double.parseDouble(reader.readLine());
		this.gWithdraw = Double.parseDouble(reader.readLine());
	}

	private void deposit() throws NumberFormatException, IOException {
		
		System.out.print("Enter Amount to Deposit:");
		//double gDeposit = Double.parseDouble(reader.readLine());
		this.gDeposit = Double.parseDouble(reader.readLine());
	
	}

	private void createAccount() throws IOException {
		System.out.println("Enter Account Holder Name");
		name = reader.readLine();	
		
		System.out.println("Enter Mobile");
		mobile = reader.readLine();	
		
		System.out.println("Enter Email");
		email = reader.readLine();	
		
		System.out.println("Enter Gender");
		gender = reader.readLine();	
		
		System.out.println("Enter Age");
		age = reader.readLine();	
		
		accountNumber = (int)Math.floor(Math.random()*1000000);
		System.out.println("Account Created "+accountNumber);
	}

}
