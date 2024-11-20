public class ClearRangeOfBits {
    public static void main(String[] args) {
        int n = 15; // 1111
        int i = 2; // 10
        int j=3;

        int result = clearRangeOfBits(n,i,j);
        System.out.println(result);
            }
        
            private static int clearRangeOfBits(int n, int i,int j) {
                     // Step 1: Create a mask with 0s from i to j
                     int a = (~0 << (j + 1)) ;
                     int b=  ((1 << i) - 1);
        int mask = a |b ;

        // Step 2: Clear the range of bits using AND
return n & mask;

               


               
            }
}
