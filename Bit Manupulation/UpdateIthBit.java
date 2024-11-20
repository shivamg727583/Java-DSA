public class UpdateIthBit {
    public static void main(String[] args) {
        int n=10;
        int i=1;
        int bitvalue =1;
        int result = UpdatedBit(n,bitvalue,i);
        System.out.println(result);
    }
    public static int UpdatedBit(int n,int bitvalue,int i){
        // clear ith bit
        int mask = 1<<i;
        n = n & (~mask);

        // set ith bit
        return n | (bitvalue<<i);
    }
}
