public class PallindromeInDoubleCLL {
    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    // Display function to print the circular doubly linked list
    public static void display(Node head) {
        if (head == null) return;

        Node t = head;
        do {
            System.out.print(t.data + " ");
            t = t.next;
        } while (t != head);
        System.out.println(); // Fix: Print a new line for better formatting
    }

    // Function to check if the circular doubly linked list is a palindrome
    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == head) return true; // Single node or empty list is a palindrome

        Node start = head;
        Node end = head.prev; // Last node in circular DLL

        while (start != end && start.next != end) { 
            if (start.data != end.data) {
                return false;
            }
            start = start.next;
            end = end.prev;
        }

        // **Handle the middle case for odd-length lists**
        return start.data == end.data;
    }


    public static void main(String[] args) {
        // Example 1: Palindrome list
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(30);
        Node e = new Node(20);
        Node f = new Node(10);

        // Connect nodes to form a circular doubly linked list
        a.next = b; b.next = c; c.next = d; d.next = e; e.next = f; f.next = a;
        a.prev = f; b.prev = a; c.prev = b; d.prev = c; e.prev = d; f.prev = e;

        display(a);
        System.out.println("Is the linked list a palindrome? " + isPalindrome(a));

        // Example 2: Not a palindrome
        Node x = new Node(1);
        Node y = new Node(2);
        Node z = new Node(3);

        x.next = y; y.next = z; z.next = x;
        x.prev = z; y.prev = x; z.prev = y;

        display(x);
        System.out.println("Is the linked list a palindrome? " + isPalindrome(x));
    }
}
