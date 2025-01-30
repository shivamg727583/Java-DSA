
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
    public static Node reverse(Node head){
        Node t = head;
        if(t==null){
            return null;
        }
        
            reverse(t.next);
           return t;
        
        
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
      Node t =  reverse(a);
      display(t);
         
        
    }
}
