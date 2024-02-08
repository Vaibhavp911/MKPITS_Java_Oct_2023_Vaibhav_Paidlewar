package com.mkpits.collection.list.linkedlist;

import java.util.LinkedList;

public class LinkedListMethod1Ex {

	public static void main(String[] args) 
	{
		LinkedList<String> iList1 = new LinkedList<>();
		// Performing Various Operations on LinkedList:
		
			//		Adding elements
		// 1. add(int index, E element)
		//	  This method Inserts the specified element at the specified position in this list.
		
		iList1.add(0, "Vaibhav");
		iList1.add(1, "Pranav");
		iList1.add(2, "Chetan");
		iList1.add(3, "Karan");
		iList1.add(4, "Vinay");
		iList1.add(5, "Raj");
		iList1.add(6, "Ashik");
		iList1.add(7, "Harsh");
		iList1.add(8, "Samiksha1");
		iList1.add(9, "Samiksha2");
		iList1.add(10, "Kastubh");
		iList1.add(11, "Rigved");
		System.out.println(iList1);
		
		//		Updating elements
		// 2. set(int index, E element)
		//	Replaces the element at the specified position in this list with the specified element (optional operation).
		iList1.set(11, "Shri");
		System.out.println(iList1);
		
		try{
			iList1.set(12, "Rugved");
		System.out.println(iList1);
		}catch(Exception e) {
			System.out.println(e);
		}
		
//			Removing elements
		// 3. remove()
		/// This method is overloaded to perform multiple operations based on different parameters.
		
		try{
			iList1.remove(12);
			System.out.println(iList1);
			}catch(Exception e) {
				System.out.println(e);
			}
		iList1.remove(11);
		System.out.println(iList1);
		
//		toArray();
		/* 4. toArray()
		 * Returns an array containing all of the elements in this list in proper sequence (from first to last element).
		 * The returned array will be "safe" in that no references to it are maintained by this list.
		 * (In other words, this method must allocate a new array).
		 * The caller is thus free to modify the returned array.
		 * */
		Object[] a = iList1.toArray(); 
        System.out.print("After converted LinkedList to Array: "); 
        for(Object element : a) 
        System.out.print("\n"+element); 
		
//		 Size();
        /* 5. int size()
         * Returns the number of elements in this list.
         */
        System.out.println("\n"+"iList1.size() = "+iList1.size());
        
//		remove First()
        // 6. E removeFirst()
        // Removes and returns the first element from this list.
       String first = iList1.removeFirst();
       System.out.println(first);
       
//		remove last();
       // 7. E removeLast();
       // 
       String last = iList1.removeLast();
       System.out.println(last);
       System.out.println(iList1);
	}

}
