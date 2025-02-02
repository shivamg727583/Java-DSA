
public class ReverseTheLinkedlist {
    
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

    // iterative method
    public static Node reverseIterative(Node head){
       Node prev = null;
       Node current = head;
       Node Next = null;
       while( current!=null){
        Next = current.next;
        current.next = prev;
        prev =current;
        current=Next;
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
      Node t =  reverseRecursive(a);
      display(t);
         
        
    }

    public static Node reverseRecursive(Node head){
        if(head==null || head.next==null){
            return head;
        }

        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

}
