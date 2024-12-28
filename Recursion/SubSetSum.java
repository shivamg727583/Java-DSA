// Write a recursive function to check if there exists a subset in a given array whose sum equals a target value.

// Example:
// Input: arr = {3, 34, 4, 12, 5, 2}, target = 9
// Output: true
// Input: arr = {3, 34, 4, 12, 5, 2}, target = 30
// Output: false

public class SubSetSum {
    public static void main(String[] args) {
        int arr[]={3, 34, 4, 12, 5, 2};
        int target =9;
     //   System.out.println(subSetSum(arr, target, 0, 0));

     // without recursion
     System.out.println(subSetSum(arr, target, 0, 0));
             
         }
     
         private static boolean subSetSum(int[] arr, int target, int i, int j) {

            if (i == arr.length) {
                return j == target;
                }
                // if the current element is greater than the target, skip it
                if (arr[i] > target) {
                    return subSetSum(arr, target, i + 1, j);


            return false;
            
         }
}
