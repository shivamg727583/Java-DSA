import java.security.PublicKey;

public class NthnodeFromEnd {

    public static class Node{
        int data;
        Node next;
        Node (int data){
            this.data = data;
        }

    }
  public static Node nthNode(Node head,int n){
        int len=0;
        Node temp = head;
        while (temp!=null) {
            len++;
            temp = temp.next;
        }


        int m = len -n +1;
        //mth node from start
        temp = head;
for (int i = 1; i < m; i++) {
    temp=temp.next;
}
return temp;


    }


    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(70);

        Node c = new Node(20);
        Node d = new Node(10);
        Node e = new Node(60);

        a.next =b;
        b.next=c;
        c.next =d;
        d.next=e;

        Node temp = nthNode(a, 1);
        System.out.println("nth node from end  is : "+temp.data);

        
    }
  
    
}
