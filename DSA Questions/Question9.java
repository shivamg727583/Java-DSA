/*
 * FizzBuzz Problem:
Print numbers from 1 to n. For multiples of 3, print "Fizz"; for multiples of 5, print "Buzz"; for multiples of both, print "FizzBuzz".
Example: Input: 15, Output: 1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz.
 */

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter a number : ");
        int n=sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if(i%5==0 && i%3==0){
                System.out.print("FizzBuzz ");
               
            }
            else if(i%5==0){
                System.out.print("Buzz ");
            }
            else if( i%3==0){
                System.out.print("Fizz ");
            }
            else{
                System.out.print(i+" ");
            }            
        }
    }
}
