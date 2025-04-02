public class LinkedListImplemenataion {

    public static class Queue {
    
       private class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
       }

       private Node front =null;
       private Node rear = null;
       private int size =0;

       void add(int val){
        Node temp = new Node(val);
        if(rear==null){
            front = temp;
            rear = temp;
        }
       }

       
        
    }
    public static void main(String[] args) {
        
    }
}
