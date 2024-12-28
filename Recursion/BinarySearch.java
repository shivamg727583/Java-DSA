
// Implement the binary search algorithm using recursion to find an element in a sorted array.

// Input: arr = {1, 2, 3, 4, 5}, key = 4
// Output: 3 (0-based index)
// Input: arr = {1, 2, 3, 4, 5}, key = 6
// Output: -1 (not found)

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int key = 4;
        int result = binarySearch(arr, key, 0, arr.length - 1);
        System.out.println("Key found at "+result+" index");
        
    }
    public static int binarySearch(int arr[], int key, int low, int high) {
        // Base case: If the low index is greater than the high index, the key is not
        if(low>high){
            return -1; // Key not found
        }
        // Calculate the mid index
        int mid = (low + high) / 2;
        if(key<mid){
            return binarySearch(arr, key, low, mid-1);
        }
        else if(key>mid+1){
            return binarySearch(arr, key, mid+1, high);
            }
            else{
                return mid; // Key found
                }





    }
}
