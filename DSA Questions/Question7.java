/*1. Print Pascal’s Triangle:
Generate Pascal’s Triangle up to n rows using loops.
Example for n = 4:
Copy code
      1
     1 1
    1 2 1
   1 3 3 1 
  1 4 6 4 1
   
   */

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        printPascalTriangle(n);
            }
        
            private static void printPascalTriangle(int numRows) {
               
                for (int row = 0; row < numRows; row++) {
                    int value = 1; // First value in each row is always 1
                    for (int col = 0; col <= row; col++) {
                        System.out.print(value + " "); // Print current value
                        value = value * (row - col) / (col + 1); // Update value using C(n, k)
                    }
                    System.out.println(); // Move to the next line
                }
            }
}
