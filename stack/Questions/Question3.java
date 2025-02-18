package Questions;

import java.util.Arrays;
import java.util.Stack;

public class Question3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 10, 10, 10, 2, 4, 4, 4, 5, 7, 7, 2};
        int[] ans = remove(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] remove(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int lastRemoved = -1; // A value not in input (assuming non-negative numbers)

        for (int i = 0; i < arr.length; i++) {
            if (!st.isEmpty() && st.peek() == arr[i]) {
                lastRemoved = st.pop(); // Remove duplicate and track it
            } else if (arr[i] != lastRemoved) {
                st.push(arr[i]); // Push only if it's not the last removed element
            }
        }

        // Convert stack to array
        int[] result = new int[st.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = st.pop();
        }

        return result;
    }
}
