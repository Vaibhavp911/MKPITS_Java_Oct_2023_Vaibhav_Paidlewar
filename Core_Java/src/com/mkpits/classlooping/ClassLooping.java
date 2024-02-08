package com.mkpits.classlooping;

class OuterClass
{
	int outerNum = 10;
	
			class InnerClass
			{
				int innerNum = 340;
				
				class InnerClass1
				{
					int innerNum1 = 43;
				}
			}
}


