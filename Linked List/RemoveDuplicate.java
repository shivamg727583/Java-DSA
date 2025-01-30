// remove duplicates from sorted linked list

public class RemoveDuplicate {


    public static class Node{
        int data ;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static void display(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;

        }
    }

    public static Node removeDuplicatedNode(Node head){
        Node temp = head;
        while (temp.next!=null) {
            if(temp.data==temp.next.data){
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
        }
        return head;

    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(1);
        Node c = new Node(2);
        Node d = new Node(3);
        Node e = new Node(3);
        Node p = new Node(3);
        Node q = new Node(4);
        Node r = new Node(4);
        Node s = new Node(5);
        Node t = new Node(6);
        Node v = new Node(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = p;
        p.next = q;
        q.next = r;
        r.next = s;
        s.next = t;
        t.next =v;

        Node temp = removeDuplicatedNode(a);
        display(temp);
    }
}
