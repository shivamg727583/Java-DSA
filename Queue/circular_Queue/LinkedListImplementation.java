public class LinkedListImplementation {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Queue {
        Node head = null;
        Node tail = null;
        int size = 0;

        void add(int val) {
            Node temp = new Node(val);
            if (size == 0) {
                head = temp;
                tail = temp;
                tail.next = head; // Make it circular
            } else {
                tail.next = temp;
                tail = temp;
                tail.next = head; // Maintain circular connection
            }
            size++;
        }

        void remove() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return;
            }
            if (size == 1) { // If only one element exists, reset queue
                head = null;
                tail = null;
            } else {
                head = head.next;
                tail.next = head; // Maintain circular connection
            }
            size--;
        }

        int peek() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }

        void display() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return;
            }
            Node temp = head;
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
            System.out.println();
        }

        int getSize() {
            return size;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.remove();
        q.add(6);

        q.display(); 
        System.out.println(q.peek()); 
    }
}
