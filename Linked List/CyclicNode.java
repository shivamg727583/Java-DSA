public class CyclicNode {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static Node CyclicLinkedlistNode(Node head){
        Node slow=head;
        Node fast = head;
        
        if(head==null || head.next==null){ 
            return null; //  no cycle
        }

        while (fast!=null && fast.next!=null) {
            slow= slow.next;
            fast = fast.next.next;

            if(slow== fast){
                Node temp = head;
            while (temp!=slow) {
                slow = slow.next;
                temp = temp.next;
                
            }
            return temp;
        }

            
        }
        return null;

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

       Node cycleNode = CyclicLinkedlistNode(a);
       System.out.println(cycleNode.data);
    }
    
}

// Find out the node where the cycle begins, i.e the node at which the tail node points.

