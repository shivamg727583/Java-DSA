
// sum of n numbers from 1;
public class SumOfN {
    public static void main(String[] args) {
        int n=10;
        System.out.println(sumOfn(n));
    }

    public static int sumOfn(int n){
        if(n==0){
            return 0;
        }
        return n+ sumOfn(n-1);
    
    }
}

