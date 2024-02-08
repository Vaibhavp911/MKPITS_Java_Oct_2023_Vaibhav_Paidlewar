package com.mkpits.string;

public class StringMethods {

	String name = "vaibhav";
	String nCase = "VAIBHAV";
	char[] ch = {'d','g','f','r','e'};
	byte[] pinCode = { 56,35,54,88,95,45,65 };
	public static void main(String[] args)
	{
		
		// note:-  String is IMMUTABLE
		// The String class represents character strings.
		// All string literals in Java programs, such as "abc",
		// are implemented as instances of this class.
		// Strings are constant; their values cannot be changed after they are created
		// String buffers support mutable strings. 
		// Because String objects are immutable they can be shared.
		// String str = "abc";
		// is equivalent to:
		//	char data[] = {'a', 'b', 'c'};
		
		
		StringMethods sM = new StringMethods();
		sM.ConstructNewString();
		sM.ConsStringOffsetCount();
		sM.StirngCopy();
		sM.StringCharAt();
		sM.StringCodePointAt();
		sM.StringCodePointBefore();
		sM.StringCodePointCount();
		sM.StringCodePoints();
		sM.StringCompareTo();
		sM.StringComToIgnoreCase();
		}
	
	
	// String ---> Constructor
	public void ConstructNewString()
	{
		// 1. String(byte[] bytes)	public void ConstructNewString(){}
				String byBy = new String(pinCode);
				System.out.println(byBy);
	}

	public void ConsStringOffsetCount()
	{
		// 2. String(char[] value, int offset, int count) 
				/*
				 * Allocates a new String that contains characters from a subarray of the character array argument.
				 * The offset argument is the index of the first character of the subarray and the count argument specifies the length of the subarray.
				 * The contents of the sub-array are copied; subsequent modification of the character array does not affect the newly created string
				 */
				String cVOC = new String(ch , 1, 2);
				System.out.println(cVOC);
	}
	
	public void StirngCopy()
	{
		// 3. String(char[] value)
				/*	
				 *  the newly created string is a copy of the argument string.
				 *  Unless an explicit copy of original is needed,
				 *  use of this constructor is unnecessary since Strings are immutable.
				 */
				String cV = new String(ch);
				System.out.println(cV);
	}
	
	//	String  ---> Methods
	
	public void StringCharAt()
	{
		// 1. charAt(int index)	
		
				/*
				 * Returns the char value at the specified index. An index ranges from 0 to length() - 1
				 */
				System.out.println(name.charAt(3));
	}
	
	public void StringCodePointAt()
	{
		//  2. codePointAt(int index)	
		/*
		 * Returns the character (Unicode code point) at the specified index.
		 * The index refers to char values (Unicode code units) and ranges from 0 to length() - 1
		 * give ascii value of character.
		 */
		System.out.println(name.codePointAt(3)); // ascii value of b = 98
	}
	
	public void StringCodePointBefore()
	{
		// 3. codePointBefore(int index)	
				System.out.println(name.codePointBefore(3));
				// ascii value of i = 105 
	}
	
	public void StringCodePointCount()
	{
		// 4. codePointCount(int beginIndex, int endIndex)	
		/*
		 * Returns the number of Unicode code points in the specified text range of this String.
		 */
		System.out.println(name.codePointCount(1, 3));	
		// converts character to unicode/ascii value and gives no.  of unicode/ascii values.
	}
	
	public void StringCodePoints()
	{
		// 5. codePoints()	
				/*
				 * Returns a stream of code point values from this sequence.
				 */
				System.out.println(name.codePoints());
	}
	
	public void StringCompareTo()
	{
		// 6. compareTo(String anotherString) 
		/*
		 * Compares two strings lexicographically.
		 * The comparison is based on the Unicode value of each character in the strings.
		 * The character sequence represented by this String object is compared lexicographically
		 * to the character sequence represented by the argument string.
		 */
		System.out.println(name.compareTo(nCase));
	}
	
	public void StringComToIgnoreCase() 
	{
			// 7. int compareToIgnoreCase(String str)
		/*
		 * Compares two strings lexicographically, ignoring case differences
		 * This method returns an integer whose sign is that of calling compareTo with case
		 * folded versions of the strings where case differences have been eliminated by 
		 * calling Character.toLowerCase(Character.toUpperCase(int)) on each Unicode code point
		 */
		System.out.println(name.compareToIgnoreCase(nCase));
	}
}
