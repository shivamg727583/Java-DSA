/* 
2. Find the Single Number:
In an array where every number appears twice except for one, find the single number using XOR.
Example: Input: [2, 2, 1], Output: 1. */

public class Question6 {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1,4,1};
        System.out.println(singleNumber(nums)); // Output: 4
                
            }
        
            private static int singleNumber(int[] nums) {
                int result = 0; // 10 00 01 101 100
                for (int num : nums) { // 2 2 1 4
                    result ^= num; //  101 ^ 001 = 100
                    }
                    return result;

               
            }
}
