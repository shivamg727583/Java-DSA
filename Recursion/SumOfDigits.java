
// Write a recursive function to calculate the sum of the digits of a given number n.
//  ex - n=1234 
//  sum = 1+2+3+4 = 10

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(Sum(1234)); // Output: 10
        
    }
    public static int Sum(int n){
        if(n==0){
            return 0;
        }
        
        int r = n%10;
        int sum = r + Sum(n/10);
        return sum;

        //  OR 

            // return n%10 + Sum(n/10);
    }
}
