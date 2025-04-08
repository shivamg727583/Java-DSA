import java.util.LinkedList;
import java.util.Queue;

public class Question4 {

    // First negative in each window of size k
    public static long[] printFirstNegativeInt(long arr[],int n, int k){
        long[] res = new long[n-k+1];
Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < n ; i++) {
            if(arr[i]<0){
                q.add(i);
            }
        }

        for (int i = 0; i < n-k+1; i++) {
            if(q.size()>0 && q.peek()<i) q.remove();
            if(q.size()>0 && q.peek()<= i+k-1){
res[i] = arr[q.peek()];
            } 
            else if(q.size()==0) res[i] = 0;
            else res[i]=0;

        }



        return res;
    }

    public static void main(String[] args) {
        long[] arr = {12,-1,-7,8,-15,30,16,28};
        int k = 3;
        int n = arr.length;

        long[]  ans = printFirstNegativeInt(arr, n, k);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+ " ");
        }
    }
    
}