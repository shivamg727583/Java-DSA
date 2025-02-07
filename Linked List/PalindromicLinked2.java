public class PalindromicLinked2 {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node nextNode = null;  // Renamed 'Next' to 'nextNode' for better readability

        while (curr != null) {
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }

    public static boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true; // Single node is always palindrome

        // Step 1: Find the middle of the linked list
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse the second half
        Node secondHalf = reverse(slow.next); // Fixed: Reverse from slow.next, not slow
        Node firstHalf = head;
        Node temp = secondHalf; // Store reference for restoring later

        // Step 3: Compare both halves
        boolean isPalin = true;
        while (temp != null) {  // Compare only the reversed second half
            if (firstHalf.data != temp.data) {
                isPalin = false;
                break;
            }
            firstHalf = firstHalf.next;
            temp = temp.next;
        }

        // Step 4: Restore the original linked list structure
        slow.next = reverse(secondHalf);  // Fixed: Restoring the list

        return isPalin;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(3);
        Node e = new Node(1);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        System.out.println("Original linked list:");
        display(a);

        System.out.println("\nIs the linked list a palindrome? " + isPalindrome(a));

        System.out.println("\nLinked list after palindrome check (should be unchanged):");
        display(a);
    }

   
}