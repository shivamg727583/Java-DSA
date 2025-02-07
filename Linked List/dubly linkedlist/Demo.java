public class Demo{

    public static  class Node{
int data;
Node next;
Node prev ;
Node(int data){
    this.data = data;
}
    }

    public static void displayUsingHead(Node head){
        while (head!=null) {
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }

    public static void displayUsingTail(Node tail){
        while (tail!=null) {
            System.out.print(tail.data+" ");
            tail = tail.prev;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        b.prev = a;
        c.prev =b;
        d.prev = c;
        e.prev = d;
       
       display(a);

    }

    public static void display(Node x){
        Node slow = x;

        if(x.prev==null){
            displayUsingHead(x);;
        }
        else if(x.next == null){
            displayUsingTail(x);
        }
        else {

            while (slow.prev!=null) {
                slow = slow.prev;
            }
            System.out.println();
displayUsingHead(slow);

        }
       
    }

}