public class CycleinLinkedlist {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }

    }

    public static boolean hasCycle(Node head){
        if(head==null || head.next==null){
            return false;
        }
        Node slow = head;
        Node fast = head;

        while (fast!=null && fast.next!=null) {
            slow =slow.next;
            fast =fast.next.next;

            if(fast==slow){
                return true;
            }
                     
        }
        return false;
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(2);
        Node c = new Node(7);
        Node d = new Node(9);
        Node e = new Node(4);

        a.next = b;
        b.next=c;
       c.next =d;
       d.next =e;
       e.next =c;

   boolean isCyclic =     hasCycle(a);
   System.out.println("thi linkedlist is cyclic or not : "+isCyclic);
        
        
    }
}
