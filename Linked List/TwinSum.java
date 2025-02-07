// Find the maximum twin sum of a linked list of even length;
// Twin of any node at (i)th index is the node at (n-i-1)th index . Twin sum is the sum of values of a node and its twin.
// ex=   1 -> 10 -> 13 -> 4 -> 5-> 6 -> 7 -> 2 ->null      

// here twins are (1,2) ,(10 ,7) ,(13,6),(4,5)     { Always for even length of linkedlist}
// so we to find max sum of twin 

public class TwinSum {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static int maxTwinSum(Node head){
        if(head==null){
            return 0;
        }

        int MaxSum = 0;
        Node slow = head;
        Node fast = head;
        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast= fast.next.next;
        }
          
        Node second = reverse(slow);
        Node temp = second;
        Node first = head;

        while (temp!=null) {
            int sum = 0;
            sum = temp.data + first.data;
            MaxSum = Math.max(MaxSum, sum);

            temp = temp.next;
            first = first.next;
        }


        return MaxSum;
    }

    public static Node reverse(Node h){
        Node prev =null;
        while (h!=null) {
            Node Next = h.next;
            h.next = prev;
            prev = h;
            h = Next;
        }

        return prev;
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(1);
        Node c = new Node(36);
        Node d = new Node(8);
        Node e = new Node(20);
        Node f = new Node(30);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

    System.out.println("Max twin sum is : "+maxTwinSum(a));

       
    }
}

