
// Given two integers x and n, write a function to compute x^n. We may assume that x and n are small and overflow doesn’t happen.


public class PowerOfx {
    public static void main(String[] args) {
        System.out.println(power(2, 3));
    }
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }
}
