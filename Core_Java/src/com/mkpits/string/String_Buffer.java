 package com.mkpits.string;

public class String_Buffer {

	String myTxt = "String buffers are safe for use by multiple threads.";// 52 characters
	public static void main(String[] args)
	{
		/*
		 * A thread-safe, mutable sequence of characters
		 * A string buffer is like a String, but can be modified.
		 * the length and content of the sequence can be changed through certain method calls.
		 * String buffers are safe for use by multiple threads.
		 */
		String_Buffer sB = new String_Buffer();
		sB.sb_Constructors();
		sB.sb_Methods();
	}

	private void sb_Constructors()
	{		
		/*
		 * 1. StringBuffer()
		 * Constructs a String buffer with no character in it and an initial capacity of 16 character.
		 */
		StringBuffer myFxt = new StringBuffer(myTxt);
		System.out.println(myFxt);
		System.out.println("----------------");
		
		/*
		 * 2. StringBuffer(int capacity)
		 * Constructs a String buffer with no character in it and the specified initial capacity
		 */
		StringBuffer myHxt = new StringBuffer(5);
		System.out.println(myHxt);	// blank string with 1 space only 
		System.out.println("----------------");
		
		/*
		 * 3. StringBuffer(String str)
		 * Constructs a String Buffer initialized to the contents of the specified String.
		 */
		StringBuffer myGxt = new StringBuffer(myTxt);
		System.out.println(myGxt);
		System.out.println("----------------");
	}

	private void sb_Methods()
	{
		/* 1. StringBuffer append(int i)
		 * Appends the string representation of the int argument to this sequence
		*/
		StringBuffer myAppend = new StringBuffer(myTxt);
		int appEnd = 6;
		myAppend = myAppend.append(appEnd);
		System.out.println(myAppend);
		System.out.println("----------------------");
		
		/* 2. StringBuffer capacity()
		 * Returns the current capacity.
		 * The capacity is the number of characters that can be stored (including already written characters),
		 * beyond which an allocation will occur.
		 */
		StringBuffer myCapacity1 = new StringBuffer(myTxt);
		StringBuffer myCapacity = new StringBuffer(myTxt)  ;
		int capacity  = myCapacity.capacity(); // myTxt = 52 characters + myCapacity = 16 (initial capacity)
		System.out.println(capacity);
		System.out.println("----------------------");
		
		/* 3. StringBuffer appendCodePoint(int codePoint)
		 * Appends the string representation of the codePoint argument to this sequence.
		 * The argument is appended to the contents of this sequence.
		 * The length of this sequence increases by Character.charCount(codePoint).
		 */
		StringBuffer stringCP = new StringBuffer(myTxt);
		StringBuffer stringCodepoint = stringCP.appendCodePoint(capacity); // capacity = 68 --> ascii value of 'D'
		System.out.println(stringCodepoint);
		System.out.println("-----------------------");
		
		/* 4. int compareTo(StringBuffer another)
		 * Compares two StringBuffer instances lexicographically.
		 * This method follows the same rules for lexicographical comparison as defined in the CharSequence.compare(this, another) method
		 * return 1. 0(zero)  	 = same character sequence as that of the argument 
		 * 		  2. +ve integer = StringBuffer is lexicographically less than the StringBuffer argument
		 * 		  3. -ve integer = StringBuffer is lexicographically greater than the StringBuffer argument 
		 */
		int compareStringBuffer = myCapacity.compareTo(myCapacity1);
		System.out.println(compareStringBuffer);
		System.out.println("-----------------------");
		
		/* 5. StringBuffer delete(int start, int end)
		 * Removes the characters in a substring of this sequence.
		 * substring begins at the specified start and extends to the character at index end - 1..
		 * If start is equal to end, no changes are made.
		 */
		String myTxt1 = "String buffers are safe for use by multiple threads."; // 52 characters
		StringBuffer deleteSB1 = new StringBuffer(myTxt1);
		deleteSB1 = deleteSB1.delete(5, 10);
		System.out.println(deleteSB1);
		System.out.println("--------------------");
		
		/* 6. StringBuffer deleteCharAt(int index)
		 * Removes the char at the specified position in this sequence.
		 * This sequence is shortened by one char.
		 */
		StringBuffer deleteCharAtSB2 = new StringBuffer(myTxt1);
		deleteCharAtSB2 = deleteCharAtSB2.deleteCharAt(45);
		System.out.println(deleteCharAtSB2);
		System.out.println("---------------------");
		
		/* 7. void ensureCapacity(int minimumCapacity)
		 * Ensures that the capacity is at least equal to the specified minimum.
		 * If the current capacity is less than the argument, then a new internal array is allocated with greater capacity.
		 * The new capacity is the larger of:
												i. The minimumCapacity argument.
												ii. Twice the old capacity, plus 2.
		 */
			int capacity1 = deleteCharAtSB2.capacity(); 
			System.out.println(capacity1); // 68
			deleteCharAtSB2.ensureCapacity((capacity1*2)+1);
			int capacity2 = deleteCharAtSB2.capacity();
			System.out.println(capacity2);	// 68*2 + 2 --> 138-minimum capacity --> Twice the old capacity, plus 2
			System.out.println("-----------------------------");
			
		/* 8. getChars(int srcBegin,int srcEnd,char[] dst,int dstBegin)
		 * 	Characters are copied from this sequence into the destination character array dst.
		 *  The first character to be copied is at index srcBegin
		 *  last character to be copied is at index srcEnd-1
		 *  total number of characters to be copied is srcEnd-srcBegin
		 *  characters are copied into the subarray of dst starting at index dstBegin and ending at index
		 */
			String myTxt3 = "vaibhavpaidlewar";
			StringBuffer gChar1 = new StringBuffer(myTxt3);
			char[] charArray = new char[5];
			gChar1.getChars(7, 12, charArray, 0);
			System.out.print("Extracted characters: ");
	        for (char ch : charArray)
	        {
	            System.out.print(ch);
	        }
	        System.out.println("--------------------------------");
		
	     /* 9. int indexOf(String str)
	      *  Returns the index within this string of the first occurrence of the specified substring.
	      *  The returned index is the smallest value k for which:
	      *  If no such value of k exists, then -1 is returned.
	      */
		
		//String myLxt = "Appends the string representation of a sub-array of the char array argument to this sequence.";
		/*StringBuffer myCharAppend = new StringBuffer(myTxt);
		char [] ch = {'f','s','j','e'};
		myCharAppend = myCharAppend.append(ch,1, 3);
		System.out.println(myAppend);
		*/
	}

	
}
