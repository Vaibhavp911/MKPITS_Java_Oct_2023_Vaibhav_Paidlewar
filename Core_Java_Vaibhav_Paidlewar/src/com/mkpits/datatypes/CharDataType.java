package com.mkpits.datatypes;

public class CharDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Use to represent one or multiple characters
		//Memory required-16 bits(2 bytes)
		//java character represent Unicode character set between ‘\u0000’ i.e no output
		//also support alphabets of all internationalized lang. Therefore, it required 1
		//byte additional.
		
		char correctAns = 'Y';
		char wrongAns = 'N';
		System.out.println("If Your Answer Is Correct: "+correctAns);
		System.out.println("If Your Ans Is Wrong: "+wrongAns);
	}

}
