/*
 * Write a recursive function to calculate the n-th Fibonacci number.
Example:
Input: n=6
Output: 8 (Fibonacci series: 0,1,1,2,3,5,8,…)
 */

public class FibonaciiSeries {
    public static void main(String[] args) {
        int n=6;
        System.out.println(n+"th position of Fibonacci number is : "+Fibonacci(n));
        
    }
    
    public static int Fibonacci(int n){
        if(n==1){
            return 0;
        }
        else if(n==2||n==3){
            return 1;
        }

        int a = Fibonacci(n-1);// f(5) f(4) f(3) / a=1 
        int b=Fibonacci(n-2); // f(4) f(3) / b=1
        return a+b;
    }
    
}
