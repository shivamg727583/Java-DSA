public class MiddleElementOfLinkedlist {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static Node MiddleElement(Node head){
        Node slow = head;
        Node fast = head;


        while (fast.next!=null && fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
           
            
        }
       
        return slow;
    }

    public static void display(Node head){
        while (head!=null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(1);
        Node c = new Node(3);
        Node d = new Node(8);
        Node e = new Node(20);
        Node f = new Node(30);
        
        a.next =b;
        b.next=c;
        c.next =d;
        d.next=e;
        e.next =f;
        
        display(a);
        Node mid = MiddleElement(a);
      System.out.println("Middle elem : "+  mid.data);
    }
}
