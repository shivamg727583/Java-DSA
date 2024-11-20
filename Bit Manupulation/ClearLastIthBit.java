

public class ClearLastIthBit {

    public static void main(String[] args) {
        int n = 10;
        int i = 2;
        int result = clearLastIthBit(n, i);

        System.out.println(result);
        System.out.println(clearLastIth(n, i));
            }
        
            private static int clearLastIthBit(int n, int i) {
                int mask = ~0 << i;
                int result = n & mask;

                return result;
            }
            private static int clearLastIth(int n, int i) {
                int mask = ~((1 << i)-1);
                int result = n & mask;

                return result;
            }
}