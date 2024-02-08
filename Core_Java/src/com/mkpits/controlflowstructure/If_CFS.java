package com.mkpits.controlflowstructure;

public class If_CFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 let 	String sT = "Vaibhav";
		 		if ( sT == "Vaibhav")
		 			{
		 			sysout --> condition will be true but comparison will not occur 
		 			ofc it will show no error but will not run
		 			}
------------------------------------------------------------------------------------------------------------------
				if( sT.equals(sT))
					{
						---> condition will compare the string and condition will be true and shows NO-ERROR and branch will run
					}
		 
		 */
		String sT = "Vaibhav";
		
		if(sT == "Vaibhav")
		{
			System.out.println("condition will be true but comparison will not occur");
		}
		
		if (sT.equals(sT))
		{
			System.out.println("condition will compare the string and condition will be true and shows NO-ERROR and branch will run");
		}
	}

}