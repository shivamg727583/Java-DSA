import java.util.ArrayList;
import java.util.HashMap;

public class LargestSubArray {

    // GIven an array of length N, find the length of the largst subArray with sum equal to 0.
    public static void main(String[] args) {
        int n = 8;
        int[] arr = {15,-2,2,-8,1,7,10,23};
        System.out.println("Max Len of Largest SubArray whose sum is 0 : "+LenghtOfSubArray(arr));
 
    }

    public static int LenghtOfSubArray(int arr[]){
        int len = 0;
        int preSum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer , Integer> map = new HashMap<>();
        map.put(0, -1); 

        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i];
            if(map.containsKey(preSum)){
              len =  Math.max(len, i -  map.get(preSum));
              
            }
            else{
                map.put(preSum, i); 
            }
        }
        
System.out.println(list);

return len;
    }
}
