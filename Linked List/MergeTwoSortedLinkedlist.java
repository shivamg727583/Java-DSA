public class MergeTwoSortedLinkedlist {
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
    }

    public static Node MergeLinkedlist(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;

        Node head3 = new Node(0);
        Node temp3 = head3;

        while (temp1 != null && temp2 != null) {
            if (temp1.data < temp2.data) {
                Node a = new Node(temp1.data);
                temp3.next = a;
                temp3 = a;
                temp1 = temp1.next;
            } else {
                Node a = new Node(temp2.data);
                temp3.next = a;
                temp3 = a;
                temp2 = temp2.next;
            }

        }

        if (temp1 == null) {
            temp3.next = temp2;
        } else {
            temp3.next = temp1;
        }
        return head3.next;

    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(3);
        Node c = new Node(5);
        Node d = new Node(7);
        Node e = new Node(9);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        Node p = new Node(2);
        Node q = new Node(4);
        Node r = new Node(6);
        Node s = new Node(8);
        Node t = new Node(10);

        p.next = q;
        q.next = r;
        r.next = s;
        s.next = t;

        System.out.println("\n Sorted linkedlist 1 : ");
        display(a);
        System.out.println("\n Sorted linkedlist 2 : ");
        display(p);

        System.out.println("\n Mergerd linkedlist  : ");
        Node temp = MergeLinkedlist(a, p);
        display(temp);
    }
}
