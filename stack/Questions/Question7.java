package Questions;

import java.util.Stack;

// Question-7 : Celebrity number

public class Question7 {

    public static void main(String[] args) {
        int[][] arr = {{0, 1, 0}, {0, 0, 0}, {0, 1, 0}};
        System.out.println("Celebrity is : " + Celebrity(arr, 3));
    }

    public static int Celebrity(int[][] arr, int n) {
        Stack<Integer> st = new Stack<>();

        // Push all people to stack
        for (int i = 0; i < n; i++) {
            st.push(i);
        }

        // Finding the potential celebrity
        while (st.size() > 1) {
            int v1 = st.pop();
            int v2 = st.pop();
            // If v1 knows v2, v1 can't be the celebrity
            if (arr[v1][v2] == 1) {
                st.push(v2);
            } else {
                st.push(v1);
            }
        }

        // Check if the potential celebrity is indeed a celebrity
        if (st.isEmpty()) return -1;

        int potential = st.pop();

        // Verify that no one knows the potential celebrity
        for (int i = 0; i < n; i++) {
            if (arr[potential][i] == 1) return -1; // Celebrity can't know anyone
        }

        // Verify that the potential celebrity knows everyone else
        for (int i = 0; i < n; i++) {
            if (i != potential && arr[i][potential] == 0) return -1; // Everyone must know the celebrity
        }

        return potential;
    }
}
