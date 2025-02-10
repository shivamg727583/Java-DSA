public class SinglyCirculerList {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static void display(Node a){
        Node t = a;
        do {
            System.out.print(t.data+" ");
            t=t.next;

        }while (t!=a);
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next =b;
        b.next =c;
        c.next =d;
        d.next=e;
        e.next = a;


        display(a);
    }


    
}