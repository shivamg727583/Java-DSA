package LinkedList_Implementation;

public class Linkedlist_Implementation {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class Stack {
        Node head = null;
        int size = 0; // Tracks the number of elements in the stack

        void push(int data) {
            Node temp = new Node(data);
            temp.next = head;
            head = temp;
            size++; // Increment size
        }

        void pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty! Cannot pop.");
                return;
            }
            head = head.next;
            size--; // Decrement size
        }

        boolean isEmpty() {
            return head == null;
        }

        int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty! No top element.");
                return -1; // Returning -1 as an error indicator
            }
            return head.data;
        }

        void display() {
            if (isEmpty()) {
                System.out.println("Stack is empty!");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int getSize() {
            return size;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        st.display(); // Output: 40 30 20 10
        
        st.pop();
        System.out.println("After pop:");
        st.display(); // Output: 30 20 10
        
        System.out.println("Peek: " + st.peek()); // Output: 30
        System.out.println("Is Empty: " + st.isEmpty()); // Output: false
        System.out.println("Stack size: " + st.getSize()); // Output: 3
    }
}
