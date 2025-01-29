public class DeleteingMiddleElement {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }


    public static void DeleteMiddle(Node head){
        Node slow = head;
        Node fast = head;

        while (fast.next.next!=null && fast.next.next.next!=null) {
            slow = slow.next;
            fast =fast.next.next;
            
        }
        slow.next = slow.next.next;
        display(head);
        // System.out.println(slow.data);
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
        // Node f = new Node(30);
        
        a.next =b;
        b.next=c;
        c.next =d;
        d.next=e;
        // e.next =f;
DeleteMiddle(a);
        
    }
}
