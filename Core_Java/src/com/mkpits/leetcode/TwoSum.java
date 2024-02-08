package com.mkpits.leetcode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoSum {

	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader iP = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Size of Array nums[]");
		byte p = Byte.parseByte(iP.readLine());
		int [] nums = new int[p];
		for (int i = 0; i < nums.length; i++) 
		{
			System.out.println("Enter Digit of Index "+i+" : ");
			nums[i]= Integer.parseInt(iP.readLine());
		}
		
		System.out.print("Enter the 'target' : ");
		int target  = Integer.parseInt(iP.readLine());
		for(int i =0 ; i< nums.length;i++)
        {
            for(int j=i+1 ; j<nums.length;j++)
            {
                if(target== (nums[i]+nums[j]))
                {
                    System.out.println("["+i+","+j+"]");
                }
                else
                {
                	System.out.println("'target' not Achived");
                }
            }
        }
		
		/*
		 * 1. Two Sum
				Easy
				Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
				You may assume that each input would have exactly one solution, and you may not use the same element twice.
				You can return the answer in any order.
				
				Example 1:
				Input: nums = [2,7,11,15], target = 9
				Output: [0,1]
				Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
				
				Example 2:
				Input: nums = [3,2,4], target = 6
				Output: [1,2]
				
				Example 3:
				Input: nums = [3,3], target = 6
				Output: [0,1]
		 * 
		 		public int[] twoSum(int[] nums, int target) 
	    			{
	    		    	// brute Force
	    		    	for(int i =0 ; i< nums.length;i++)
	    		    	{
	    		        	for(int j=i+1 ; j<nums.length;j++)
	    		        		{
	    		            		if(target== nums[i]+nums[j])
	    		            		{
	    		                		return new int[]{i, j};
	    		            		}
	    		        		}
	    		    	}
	    		    	return new int[]{}; // No solution found
	    			}
	   */
	}

}
