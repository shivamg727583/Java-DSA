/*Rotate an Array by K Steps:
Rotate the array to the right by k steps.
Example: Input: nums = [1, 2, 3, 4, 5, 6, 7], k = 3, Output: [5, 6, 7, 1, 2, 3, 4]. */


public class Question10 {
    public static void main(String[] args) {
        int arr[] ={1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotateArray(arr, k);
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                    }
                    
                
            }
        
            private static void rotateArray(int[] arr, int k) {
               k = k % arr.length;
               reverse(arr, 0, arr.length - 1);
               reverse(arr, 0, k - 1);
               reverse(arr, k, arr.length - 1);
                              }
               
                           private static void reverse(int[] arr, int k, int i) {
                              while (k < i) {
                                int temp = arr[k];
                                arr[k] = arr[i];
                                arr[i] = temp;
                                k++;
                                i--;
                                }
                                }

                           }
            

