import java.util.LinkedList;

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

            //  1 2 3 4

            

            System.out.println(head.next); // null not conecction
            head.next = b;
            System.out.println(head.next); // 2 =  address of b is connected to head
            b.next = c;
            
            System.out.println(b.next); // 3 = address of c is connected to b
            c.next = d;
            System.out.println(c.next); // 4 = address of d is connected to c

//     To show the data of each node
           //  Method - 01 (using print statement)
 
        //   System.out.println(head.data);
        //     System.out.println(head.next.data);
        //     System.out.println(head.next.next.data);
        //     System.out.println(head.next.next.next.data);

        // Method - 02 (using loop )

        // Node temp = head;
        // while(temp != null){
        //     System.out.print(temp.data+" ");
        //     temp = temp.next; //
        // }

        // Method - 03 (using recursion)
         
        printList(head);
    }


    public static void printList(Node head){
        if(head == null){
            return;
        }
        System.out.println(head.data+" ");
        printList(head.next);
    }

        
    }
    
