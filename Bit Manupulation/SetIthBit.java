public class SetIthBit {
    public static void main(String[] args) {
        int n = 10;
        int i = 3;
        int result = setIthBit(n, i);
                System.out.println(result);
            }
        
            private static int setIthBit(int n, int i) {
               return n | (1 << i);
            }
}
// i=3

// n = 10 = 0000 1010

// 1<<i = 0000 1000  

// So, 0000 1010 | 0000 1000 = 0000 1010

// 0000 1010 = 10
