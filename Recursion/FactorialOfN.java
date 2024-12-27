
// Write a recursive function to calculate the factorial of a number n.


public class FactorialOfN {
    public static void main(String[] args) {
        int n=5;
        System.out.println("Factorial of "+n+" is : "+factorial(n));
    }
    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
    
}
