
public class Min_Max_SUbSum_PrefixSum {
    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        int prefixArray[] = new int[arr.length];
     
        int maxSubSum = Integer.MIN_VALUE;
        int sum = 0;
   
        prefixArray[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixArray[i] = prefixArray[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = 0; j < prefixArray.length; j++) {
                int end = j;
                sum = start == 0 ? prefixArray[end] : prefixArray[end] - prefixArray[i - 1];
              
              
                if (sum > maxSubSum) {
                    maxSubSum = sum;
                }
               
            }
         
           

        }
     

        System.out.println("MAx sum : " + maxSubSum);
    }
}

/// prefix sum method - time complexity - O(n^2) - which is optimise solution than normal max_minSOlution