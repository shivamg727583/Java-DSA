public class DeletenthNodeFromEnd {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    // Remove nth node from end and return head 
    
    public static Node removeNthNode(Node head, int n){
        Node slow = head;
        Node fast = head;

        // case-1  checking if linkedlist contain only one element
        if(head.next == null){
            head=null;
            return head;
        }

        for (int i = 0; i < n; i++) {
            fast = fast.next;
            
        }

        if(fast == null){
            return head.next;
        }

        while (fast.next!= null) {
            slow =slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return head;
    }



    


    public static void main(String[] args) {
        Node head = new Node(4);
        Node a = new Node(1);
        Node b = new Node(7);
        Node c = new Node(2);
        Node d = new Node(8);

        head.next =a;
        a.next =b;
        b.next =c;
        c.next =d;


        Node temp = removeNthNode(head, 4);
        
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
       
    }

}
