public class IntersectionOfTwoList {
    public static class Node{
        int data;
        Node next;
        Node (int data){
            this.data = data;
        }

    }

    public static int size(Node head){
        int len =0;
        while (head!=null) {
            len++;
            head=head.next;
        }
        return len;
    }

    public static void display(Node head){
        while (head!=null) {
            System.out.print(head.data+" ");
            head = head.next;
            
        }
    }

    public static Node intersectionNode(Node head1 , Node head2){
        Node temp = head1;
        Node temp2 = head2;

        int len1 = size(head1);
        int len2 = size(head2);

     if(len1>len2){
        int extra = len1 - len2;
        for (int i = 0; i < extra; i++) {
            temp = temp.next;
            
        }
     }
     else {
        int extra = len2 - len1;
        for (int i = 0; i < extra; i++) {
            temp2 = temp2.next;
            
        }

     }


     while (temp!=null || temp2!=null) {
        if(temp.data == temp2.data){
            return temp;
        }
        else {
            temp = temp.next;
            temp2 = temp2.next;
        }
     }

        return temp;

    }
    public static void main(String[] args) {
        Node head=  new Node(3);
        Node a=  new Node(6);
        Node b=  new Node(4);
        Node c=  new Node(1);
        Node d=  new Node(2);
        Node e=  new Node(41);
        Node f=  new Node(1);
        Node g=  new Node(23);

        head.next =a;
        a.next =b;
        b.next=c;
        c.next=d;
        d.next = e;
        e.next=f;
        f.next=g;

        Node head2 = new Node(11);
        Node a2 = new Node(14);

        head2.next=a2;
        a2.next = d;

        System.out.println("list one : ");
        display(head);
        System.out.println("\n list 2nd : ");
        display(head2);

        System.out.println("\n Intersetion of these two linklists are : ");
Node intersetion = intersectionNode(head, head2);
display(intersetion);


        
      

    }
}
