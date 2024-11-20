public class GetIthBit {
    public static void main(String[] args) {
        int n = 5; // binary: 1010
        int i = 2;  // index of bit to get (0-based)

        // Using bitwise operation to get the ith bit
        System.out.println(getIthBit(n, i)); // prints 0

      
    }

    private static int getIthBit(int n, int i) {
        // Use bitwise shift and AND to extract the ith bit
        return (n >> i) & 1;
    }
}
