public class CountSetBits {
    public static void main(String[] args) {
        int n = 10; // 15 = 1111
        int count = countSetBits(n);
                System.out.println("Number of set bits: " + count);
            }
        
            private static int countSetBits(int n) {
               int count = 0;
               while (n != 0) {
                count++;
                n = n & (n - 1);

            }
            return count;
}
}