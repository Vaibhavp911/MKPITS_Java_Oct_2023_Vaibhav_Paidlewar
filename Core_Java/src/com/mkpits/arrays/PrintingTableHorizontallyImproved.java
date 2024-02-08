package com.mkpits.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintingTableHorizontallyImproved
{
	// Provided clearer and more user-friendly error messages in case of invalid input.
    public static void main(String[] args) {
    	/* Exception Handling:
    	 * Improved exception handling by catching IOException and 
    	 * NumberFormatException separately and providing appropriate error messages.
    	 */
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
        {
            int numTable = getValidInput(br);
            int[][] table = generateMultiplicationTable(numTable);
            printTable(table);
        } 
        catch (IOException | NumberFormatException e)
        {
            System.err.println("Error: Invalid input. Please enter a valid integer.");
        }
    }

    private static int getValidInput(BufferedReader br) throws IOException {
        int numTable;
        while (true)
        {
            System.out.println("Enter the number to print the table up to:");
            /* Encapsulated input validation into a separate method (getValidInput)
             * to ensure that the entered value is a positive integer.
             */
            try
            {
                numTable = Integer.parseInt(br.readLine());
                if (numTable > 0)
                {
                    break;
                } else
                	{
                    System.out.println("Please enter a positive integer.");
                	}
            } 
            catch (NumberFormatException e)
            {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
        return numTable;
    }

    private static int[][] generateMultiplicationTable(int numTable)
    {
    	/* Split the code into methods (generateMultiplicationTable, printTable)
    	 * for better modularity and readability.
    	 */
        int[][] table = new int[numTable + 1][numTable + 1];
        for (int i = 1; i <= numTable; i++) {
            for (int j = 1; j <= numTable; j++) {
                table[i][j] = i * j;
            }
        }
        return table;
    }

    private static void printTable(int[][] table) {
        System.out.println("---------------");
        System.out.println("Multiplication Table:");
        for (int i = 1; i < table.length; i++) {
            for (int j = 1; j < table[i].length; j++) {
                System.out.printf("  %2d  |", table[i][j]);
            }
            System.out.println();
        }
    }
}
