public class SplitIntoEvenOdd {
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

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(7);
        Node e = new Node(9);
        Node p = new Node(5);
        Node q = new Node(4);
        Node r = new Node(23);
        Node s = new Node(8);
        Node t = new Node(10);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = p;
        p.next = q;
        q.next = r;
        r.next = s;
        s.next = t;

        Node temp1 = a;
        Node list1 = new Node(0);
        Node l1 = list1;
        Node list2 = new Node(0);
        Node l2 = list2;
        while (temp1 != null) {
            if (temp1.data % 2 == 0) {
                l1.next = temp1;
                l1 = l1.next;
            } else {
                l2.next = temp1;
                l2 = l2.next;
            }
            temp1 = temp1.next;

        }

        l1.next=null;
        l2.next=null;
        


       
        System.out.println("Linkedlist : ");
        display(a);

        System.out.println("\neven list : ");
        display(list1.next);
        System.out.println("\n Odd list : ");
        display(list2.next);

    }
}

// Given a linkedlist ,split it into 2 lists such that one contains odd values ,
// while the other contains even values.
