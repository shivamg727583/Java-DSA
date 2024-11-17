public class FindTarget {
    public static void main(String[] args) {
        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        int k = 3;

        // Rotate the array
        rotate(nums, k);

        // Print the rotated array
        System.out.println("Rotated array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        // Find the index of a target value
        int target = 5;
        int index = findIndex(nums, target);
        System.out.println("\nIndex of target (" + target + "): " + index);
    }

    public static void rotate(int arr[], int k) {
        int n = arr.length;

        k = k % n; // Handle cases where k is greater than the array length

        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static int findIndex(int arr[], int target) {
        int n = arr.length;
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1; // Target not found
    }
}
