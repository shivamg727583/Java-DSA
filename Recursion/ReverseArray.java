
//  Write a recursive function to print the elements of an array in reverse order.

//   Example:
//   Input: arr = {1, 2, 3, 4, 5}
//    Output: 5 4 3 2 1

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length; // lenght of the array
        reverse(arr, n);
        
    }
    public static void reverse(int arr[],int n){
        if(n==0){
            return;
        }
        
        System.out.print(arr[n-1]+" ");
        reverse(arr,n-1);
    }
}
