/*1. Find the Maximum Subarray Sum (Kadane’s Algorithm):
Given an array of integers, find the contiguous subarray with the maximum sum.
Example: Input: [-2, 1, -3, 4, -1, 2, 1, -5, 4], Output: 6 (subarray [4, -1, 2, 1]). */


public class Question1{
   public static void main(String[] args){
    int[] arr ={-2,1,-3,4,-1,2,1,-5,4};
    int maxSum = kadaneAlgorithm(arr);
        System.out.println("Maximum Subarray Sum: "+maxSum);
    
       }
    
    private static int kadaneAlgorithm(int[] arr) {
       int maxSoFar = arr[0];
       int maxEndingHere = arr[0];
       for(int i=1;i<arr.length;i++){
        maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
        maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;

    }
    
}