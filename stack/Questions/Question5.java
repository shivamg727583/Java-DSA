package Questions;

import java.util.Stack;

public class Question5 {
    public static void main(String[] args) {
        int[] height = {5, 2, 4, 6, 3, 5};
        System.out.println("Largest area is: " + Area(height));
    }

    public static int Area(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] nextSmall = new int[n];
        int[] prevSmall = new int[n];

        // Calculate nextSmall (next smaller element index)
        st.push(n - 1);
        nextSmall[n - 1] = n; // Last element has no smaller element on the right

        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }

            nextSmall[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        // Clear stack
        while (!st.isEmpty()) {
            st.pop();
        }
        
        // Calculate prevSmall (previous smaller element index)
        st.push(0);
        prevSmall[0] = -1; // First element has no smaller element on the left

        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            prevSmall[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        // Calculate max area
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int area = arr[i] * (nextSmall[i] - prevSmall[i] - 1);
            System.out.println("Area for bar " + arr[i] + " is: " + area);
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

   
}
