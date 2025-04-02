package Questions;

import java.util.Arrays;
import java.util.Stack;

public class Question4 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 2, 1, 8, 6, 3, 4};
        int[] arr2 = Arrays.copyOf(arr1, arr1.length); // Copy to prevent modification

        System.out.println("Brute Force Approach:");
        int[] result1 = nextGreaterBruteForce(arr1);
        System.out.println(Arrays.toString(result1));

        System.out.println("Optimized Stack Approach:");
        int[] result2 = nextGreaterUsingStack(arr2);
        System.out.println(Arrays.toString(result2));
    }

    // Brute Force O(n^2)
    public static int[] nextGreaterBruteForce(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            result[i] = -1; // Default to -1
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    result[i] = arr[j];
                    break;
                }
            }
        }

        return result;
    }

    // Optimized O(n) using Stack
    public static int[] nextGreaterUsingStack(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }

        return result;
    }
}
