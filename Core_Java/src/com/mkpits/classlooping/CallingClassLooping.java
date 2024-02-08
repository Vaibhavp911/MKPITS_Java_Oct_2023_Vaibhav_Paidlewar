package com.mkpits.classlooping;

public class CallingClassLooping {

		public static void main(String[] args)
		{

			// creating object of OuterClass
			OuterClass oC = new OuterClass();
			System.out.println("outerNum : "+oC.outerNum);
			
			// creating object of InnerClass
			OuterClass.InnerClass iC = oC.new InnerClass();
			System.out.println("innerNum : "+iC.innerNum);
			
			// creating object of InnerClass1
			OuterClass.InnerClass.InnerClass1 ic1 = iC.new InnerClass1();
			System.out.println("innerNum1 : "+ic1);
		}

	}

