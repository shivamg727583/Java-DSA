public class Implementation {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {
        Node head = null;
        Node tail = null;

        void addNode(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        int length() { // O(n)
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        void addNodeAtStart(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        void insertNodeAt(int idx, int data) {
            if (idx < 0 || idx > length()) {
                System.out.println("Invalid index");
                return;
            }
            if (idx == 0) {
                addNodeAtStart(data);
                return;
            }
            if (idx == length()) {
                addNode(data);
                return;
            }

            Node t = new Node(data);
            Node temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }

        void deleteLastNode() {
            if (head == null) {
                System.out.println("List is empty!");
                return;
            }
            if (head.next == null) {
                head = null;
                tail = null;
                return;
            }
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
  
        int getAt(int idx){
            Node temp = head;
            int value = 0 ;
           
            if(idx<0 || idx>length()-1){
                System.out.println("Invalid index");
                return value;
            }
            
            for (int i = 0; i <= idx; i++) {
               value = temp.data ;
               temp = temp.next;
                
            }


            return value;
        }
  
        void deleteHeadNode(){
            if (head == null) {
                System.out.println("List is empty!");
                return;
            }
            if (head.next == null) {
                head = null;
                tail = null;
                return;
            }
            head = head.next; // Move head to the next node
        }
  
        void deleteAt(int idx){

            if(head==null){
                System.out.println("List is empty");
                return;
            }

            if(idx<0 || idx > length()-1){
                System.out.println("Invalid index value");
                return;
            }

            // case:1 - if idx = 0
            if(idx==0){
                head = head.next;
                if(head==null){ // if list become empty
                    tail = null;
                }
                return;
            }
            
            Node temp = head;

            for (int i = 0; i < idx-1 ; i++) {
                temp = temp.next;                
            }

            // case-2 : Deleting last node
            if(temp.next == tail){
                tail = temp;
            }

            temp.next = temp.next.next;

        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNode(2);
        list.addNode(3);
        list.addNode(5);
        list.addNode(6);

        list.addNodeAtStart(4);
        list.addNodeAtStart(8);

        list.display(); // Output: 8 4 2 3 5 6

        list.deleteLastNode();
        list.display(); // Output: 8 4 2 3 5

        list.insertNodeAt(2, 10);
        list.display(); // Output: 8 4 10 2 3 5

        int value = list.getAt(2);
        System.out.println("value : "+value);

        list.deleteHeadNode();
        list.display();
        

       list.deleteAt(2);
       list.display();;

    }
}
