public class ClearIthBit {
    public static void main(String[] args) {
        int n = 10; // 15 = 1111 in binary
        int i = 1; // 2nd bit to be cleared from right side
        int mask = 1 << i; // 1000 in binary
        System.out.println("Number: " + (n&(~mask)));
    }
}
