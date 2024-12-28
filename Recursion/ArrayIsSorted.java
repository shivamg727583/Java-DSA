
// Write a recursive function to check if an array is sorted in ascending order.

//   Input: arr = {1, 2, 3, 4, 5}
//    Output: true
//   Input: arr = {1, 3, 2, 4, 5}
//     Output: false



public class ArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(isSorted(arr, arr.length - 1)); // prints: true
        
    }
    public static boolean isSorted(int arr[],int n){
        if(n==1 || n==0){
            return true;
        }
        if(arr[n]>arr[n-1]){
            return isSorted(arr,n-1);
        }
        return false;

    }
}
