public class LinkedListNode {

  public static class Node {
      int data;
      Node next;
      Node prev;

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
              temp.prev = tail;
          }
          tail = temp;
      }

      void addNodeAtStart(int data) {
          Node temp = new Node(data);
          if (head == null) {
              head = temp;
              tail = temp;
          } else {
              head.prev = temp;
              temp.next = head;
              head = temp;
          }
      }

      void addNodeAtEnd(int data) {
          Node temp = new Node(data);
          if (head == null) {
              head = temp;
              tail = temp;
          } else {
              tail.next = temp;
              temp.prev = tail;
              tail = temp;
          }
      }

      void addNodeAtIdx(int data, int index) { // 0-based index
          if (index == 0) {
              addNodeAtStart(data);
              return;
          }

          Node temp = new Node(data);
          Node a = head;
          for (int i = 0; i < index - 1 && a != null; i++) {
              a = a.next;
          }

          // If index is out of bounds, add to end
          if (a == null || a.next == null) {
              addNodeAtEnd(data);
              return;
          }
// a temp b
          Node b = a.next;
a.next = temp;
temp.prev =a;
temp.next = b;
b.prev =temp;
          // temp.next = b;
          // temp.prev = a;
          // a.next = temp;
          // if (b != null) {
          //     b.prev = temp;
          // } else {
          //     tail = temp;
          // }
      }

      void deleteFromStart() {
          if (head == null) return;
          if (head.next == null) {
              head = null;
              tail = null;
              return;
          }
          head = head.next;
          head.prev = null;
      }

      void deleteFromEnd() {
          if (head == null) return;
          if (head.next == null) {
              head = null;
              tail = null;
              return;
          }
          tail = tail.prev;
          tail.next = null;
      }

      void deleteAtIndex(int index) { // 0-index based
          if (head == null) return;
          if (index == 0) {
              deleteFromStart();
              return;
          }

          Node temp = head;
          for (int i = 0; i < index && temp != null; i++) {
              temp = temp.next;
          }

          if (temp == null) return; // Index out of bounds
          if (temp == tail) {
              deleteFromEnd();
              return;
          }

          temp.prev.next = temp.next;
          temp.next.prev = temp.prev;
      }

      void display() {
          Node temp = head;
          System.out.println("Linked List:");
          while (temp != null) {
              System.out.print(temp.data + " ");
              temp = temp.next;
          }
          System.out.println();
      }
  }

  public static void main(String[] args) {
      LinkedListClass list = new LinkedListClass();
      list.addNode(10);
      list.addNode(20);
      list.addNode(30);
      list.addNode(40);
      list.addNodeAtStart(50);
      list.addNodeAtStart(60);
      list.addNodeAtEnd(100);
      list.addNodeAtIdx(25, 2);
      System.out.println("before  : ");
      list.display();
      System.out.println("\n after  : ");
     list.deleteAtIndex(2);
      list.display();
  }

  public static class LinkedListClass{
    Node head = null;
    Node tail = null;

    void addNode(int data){
        Node temp = new Node(data);
        if(head==null){
            head = temp;
            tail = temp;
            return;
        }
        tail.next = temp;
        temp.prev = tail;
        tail = temp;

    }

    void addNodeAtStart(int data){
        Node temp = new Node(data);
        if(head==null){
            head = temp;
            tail = temp;
            return;
        }
        head.prev = temp;
        temp.next = head;
        head = temp;
    }

    void addNodeAtEnd(int data){
        Node temp = new Node(data);
        if(head==null){
            head = temp;
            tail = temp;
            return;
        }
        tail.next = temp;
        temp.prev = tail;
        tail = temp;
    }

    void addNodeAtIdx(int data, int index){
        Node temp = new Node(data);
        if(index==0){
            addNodeAtStart(data);
            return;
        }
        Node a = head; // 60 
        for (int i = 1; i < index;  i++) {
            a = a.next;
        }
        if(a==null) return;
        if(a.next== null){
            addNodeAtEnd(data);
            return;
        }
        temp.next = a.next; // 
        a.next.prev = temp;
   a.next = temp; //  a.next = 25
   temp.prev = a; //  temp.prev = a        
    }

    void deleteFromStart(){
    if(head==null) return ;
    if(head.next==null){
        head = null;
        tail = null;
        return;
    }

    head = head.next;
    head.prev = null;
    }

    void deleteFromEnd(){
        if(head==null) return ;
        if(head.next==null){
            head= null;
            tail= null;
            return;
        }
       tail = tail.prev; // 40 100
        tail.next = null;
        
        
    }

    void deleteAtIndex(int index){
        if(index==0){
            deleteFromStart();
            return;
        }
        if(head==null) return;
        if(head.next==null){
            head= null;
            tail = null;
            return;
        }
        Node temp = head;
        for(int i=0;i<index && temp!=null;i++){
            temp = temp.next;
        }
        if(temp==null) return;
        if(temp.next==null){
            deleteFromEnd();
            return;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;

    }

    void display(){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
  }
}
