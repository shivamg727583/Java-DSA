/*1. Count Set Bits:
Write a function to count the number of 1s (set bits) in the binary representation of a number.
Example: Input: 13 (binary: 1101), Output: 3. */

public class Question5 {
    public static void main(String[] args) {
        int n =15;
        System.out.println(countSetBits(n));
            }
        
            private static int countSetBits(int n) {
                int count=0;
                while(n>0){
                    count++;
                    n= n&(n-1); 
                }
                return count;
                
            }
}
