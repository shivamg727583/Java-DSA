public class SingliyLinkedList {
    
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    
        
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);

        head.next = second; // 10 -> 20
        second.next = third; // 20 -> 30
        third.next = fourth; // 30 -> 40
        fourth.next = fifth; // 40 -> 50

        int lenght = length(head);
        System.out.println("Length of the linked list is: "+lenght);


        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data+" ");
            temp = temp.next;
            
        }
        


    }
    public static int length(Node head){
        int count =0 ;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }
}
