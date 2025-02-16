package Array_Implementation;

public class ArrayImplementation {
    public static class Stack {
        private int arr[] = new int[10];
        private int idx = 0;

        void push(int data) {
            if (isFull()) {
                System.out.println("Stack is full! Cannot push " + data);
                return;
            }
            arr[idx] = data;
            idx++;
        }

        void pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty! Cannot pop.");
                return;
            }
            idx--;  // First decrease the index
            arr[idx] = 0; // Not necessary, but for clarity
        }

        int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty! No top element.");
                return -1; // Returning -1 as an indication of an error
            }
            return arr[idx - 1]; // Fix: idx-1 instead of idx
        }

        void display() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return;
            }
            for (int i = 0; i < idx; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        boolean isEmpty() {
            return idx == 0;
        }

        boolean isFull() {
            return idx == arr.length;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(2);
        st.push(4);
        st.push(6);
        st.push(8);
        st.push(10);
        
        st.display();

        st.pop();
        System.out.println("After pop:");
        st.display();

        System.out.println("Top element: " + st.peek());
        System.out.println("Stack size: " + st.idx);
        System.out.println("Is Empty: " + st.isEmpty());
        System.out.println("Is Full: " + st.isFull());
    }
}
