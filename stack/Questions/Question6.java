package Questions;

import java.util.Stack;

public class Question6 {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 9, 2, 8, 4 };
        MinStack st = new MinStack();

        for (int i = 0; i < arr.length; i++) {
            st.push(arr[i]);
        }

        System.out.println(st.getMin()); // Corrected from st.min to st.getMin()
    }

    public static class MinStack {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> min = new Stack<>();

        void push(int data) {
            st.push(data);
            if (min.isEmpty() || data <= min.peek()) { // Compare before pushing
                min.push(data);
            }
        }

        void pop() {
            if (!st.isEmpty()) {
                if (st.peek().equals(min.peek())) {
                    min.pop();
                }
                st.pop();
            }
        }

        int peek() {
            return st.peek();
        }

        int getMin() {
            if (!min.isEmpty()) {
                return min.peek();
            }
            throw new IllegalStateException("Stack is empty");
        }
    }
}
