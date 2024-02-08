package com.mkpits.controlflowstructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class While_Banking_CFS {

	int choice;
	BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		While_Banking_CFS wBcfs = new While_Banking_CFS();
		
		System.out.println("wel-Come");
		System.out.println("SILVERCON BANK");
		System.out.println("Enter UserName: ");
		String userName = wBcfs.bR.readLine();
		System.out.println("Enter PassWord: ");
		String passWord = wBcfs.bR.readLine();
		System.out.println("******************************************************************");
	
		System.out.println(" 1. PAST TRANSACTIONS \n 2. Balance \n 3. UPI \n 4. NEFT/RTGS \n 5. CREDIT/DEBIT CARD \n 6. DEMAND DRAFT \n  7. Investment Option \n 8. Security Feature");
		System.out.println("Enter Digit of Your Choice: ");
		byte digit =Byte.parseByte(wBcfs.bR.readLine());

		while (digit>0 && digit <9) 
		{
			
			switch (digit) 
			{
			case 1:
				wBcfs.serviceTransaction();
				break;
			case 2:
				wBcfs.serviceBalance();
				break;
			case 3:
				System.out.println("UPI services page");
				wBcfs.serviceUPI();
				break;
			case 4:
				wBcfs.serviceNEFT_RTGS();
				break;
			case 5:
				wBcfs.serviceCARDS();
				break;
			case 6:
				wBcfs.serviceDD();
				break;
			case 7:	
				wBcfs.serviceInvestment();
				break;
			case 8:
				wBcfs.serviceSecurity();
			default:
				System.out.println("Thank You For Using The Service");
				System.out.println("Do you want to start the process again, Enter Digit: "+digit);
				break;
			}
		}
				
			
		}
			
			public void serviceTransaction()
			{
				System.out.println("Past Transactions are, ");
			}
			
			public void serviceBalance()
			{
				System.out.println("Your Balance is, ");
			}
			
			public void serviceUPI() throws IOException 
			{
				
				System.out.println(" 1. SCAN \n 2. ACCOUNT_TRANSFER \n 3. MOBILE_NUMBER_TRANSFER \n 4. SERVICES");
				String choice = bR.readLine();
				System.out.println("ENTER UPI SERVICE CHOICE: ");
				this.choice = Integer.parseInt(choice);
				if (this.choice>0 && this.choice<=4)
				{
					System.out.println("in the loop banger");
				}
				else {
					System.out.println("Enter Correct SERVICES option again !");
				}
			}

			public void serviceDD() {
				// TODO Auto-generated method stub
				System.out.println("follow the Link to fill DD Form");
			}
			
			public void serviceNEFT_RTGS()
			{
				System.out.println("Choose NEFT oR RTGS");
			}
			
			public void serviceCARDS()
			{
				System.out.println("Choose Credit_Card oR Debit_Card");
			}
			
			public void serviceInvestment()
			{
				System.out.println("Choose Type Of Investment: \n 1. DMAT_Acc \n 2. Gold \n 3. Soverign_Gold_Bond \n");
			}
			
			public void serviceSecurity()
			{
				System.out.println(" 1. Change Password \n 2. Customer_Service_Associate \n 3. Steps_To_Secure_Account");
			}

}
