public class RemoveNode {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node removeNodes(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Reverse the linked list
        Node prev = null, curr = head, next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Traverse reversed list and remove smaller elements
        Node newHead = prev;
        Node maxNode = prev;
        curr = prev.next;

        while (curr != null) {
            if (curr.data < maxNode.data) {
                maxNode.next = curr.next;
            } else {
                maxNode = curr;
            }
            curr = curr.next;
        }

        // Reverse back to original order
        prev = null;
        curr = newHead;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public static void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(1);
        Node c = new Node(36);
        Node d = new Node(8);
        Node e = new Node(20);
        Node f = new Node(30);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        System.out.println("Original List:");
        display(a);

        System.out.println("Modified List:");
        Node modifiedHead = removeNodes(a);
        display(modifiedHead);
    }
}
