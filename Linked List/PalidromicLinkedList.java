public class PalidromicLinkedList {

    public static class Node{
        int data;
        Node next;
        Node (int data){
            this.data = data;
        }
    }

    public static void display(Node head){
        while (head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static boolean isPallindrome(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node secondHalf = reverse(slow);
        Node copySecondHalf = secondHalf;
        Node firstHalf = head;
        while (firstHalf != null && secondHalf != null){
            if (firstHalf.data != secondHalf.data){
                break;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        reverse(copySecondHalf);
        if (firstHalf == null || secondHalf == null){
            return true;
        }
        return false;
    }

    
    public static Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(7);
        Node e = new Node(9);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
System.out.println("Original linkedlist : \n");
        display(a);

        System.out.println("\n After reverse linkedlist : \n");
        Node t = reverse(a);
        display(t);
        System.out.println("\n Is the linkedlist a palindrome : " + isPallindrome(a));

    }
}
