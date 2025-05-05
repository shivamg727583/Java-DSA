import java.util.HashMap;
import java.util.Map;

public class Question1 {

    // Q-1 - Given an array, find the most frequent elem in it , if there are multiple elems that appears a maximum number of times, print any one of them,
    //  n = 6 
    // arr[] = {1,3,2,1,4,1}
    // expected output  -  1
    public static void main(String[] args) {
        int[] arr = {1,3,2,3,4,3,2};
        System.out.println(mostFrequentElem(arr));
    }

    public static int MostFrequent(int[] arr){
        Map<Integer,Integer> mp = new HashMap<>();

        for (int i : arr) {         
            if(mp.containsKey(i)){
                int val = mp.get(i);
                mp.put(i, val+1);
            }
            else{
                mp.put(i,1 );
            }
           

        }

        int max = 0;
        int res = 0;
        for (var e : mp.entrySet()) {
            int x = max;
            max = Math.max(max, e.getValue());
            if(x<max){
                res = e.getKey();
            }
           
        }
     return res;
    }

    // Method - 02 

    public static int mostFrequentElem(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
    
        int maxFreq = 0, result = -1;
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                result = entry.getKey();
            }
        }
        return result;
    }
    
}
