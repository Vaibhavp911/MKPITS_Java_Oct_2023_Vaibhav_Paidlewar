package com.mkpits.userinput;

import java.io.IOException;

public class Registration_Form {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		R_Form_Method rFM = new R_Form_Method();
		// Calling every method for taking user input of registration form , (line 12 to line 19)
		rFM.getFname();
		rFM.getLname();
		rFM.getAge();
		rFM.getGender();
		rFM.getMobile();
		rFM.getEmail();
		rFM.getPassword();
		rFM.getConfirmPassword();
		// Printing form with user input
		rFM.getFormDetails();
		//gch
	}

}
