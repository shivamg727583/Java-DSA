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

    public static Node reverse(Node head){
        Node prev = null;
        Node curr = head;
        Node Next = null;
        while (curr!=null) {
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
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


        Node temp1 = a;
        Node temp2 = t;
 boolean palindrome = true;
        while (temp1!=null) {
            if(temp1.data != temp2.data){
palindrome = false;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        System.out.println("\n Is the linkedlist a palindrome : " + palindrome);

    }
}
