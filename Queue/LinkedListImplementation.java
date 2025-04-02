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
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        void remove() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return;
            }
            head = head.next;
            size--;
            if (size == 0) {
                tail = null; // Reset tail when queue becomes empty
            }
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
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        boolean isEmpty() {
            return size == 0;
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

        q.display(); // Output: 1 2 3 4 5
        System.out.println("Peek: " + q.peek()); // Output: 1

        q.remove();
        q.display(); // Output: 2 3 4 5
        System.out.println("Peek: " + q.peek()); // Output: 2

        q.remove();
        q.remove();
        q.remove();
        q.remove(); // Should print "Queue is empty"

        q.display(); // Should print "Queue is empty"
        System.out.println("Peek: " + q.peek()); // Should print "Queue is empty" and return -1

        System.out.println("Is Empty: " + q.isEmpty()); // Output: true
    }
}
