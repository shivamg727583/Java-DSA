public class Basics{
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    
        
    }
    public static void main(String[] args) {
       Node head = new Node(1);
       Node b = new Node(2);
         Node c = new Node(3);
            Node d = new Node(4);

            System.out.println(head.next); // null not conecction
            head.next = b;
            System.out.println(head.next); // 2 =  address of b is connected to head
            b.next = c;
            System.out.println(b.next); // 3 = address of c is connected to b
            c.next = d;
            System.out.println(c.next); // 4 = address of d is connected to c

        // now all are connected to each other head -> b -> c -> d
    }
    
}