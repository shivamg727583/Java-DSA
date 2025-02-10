import java.util.Arrays;

public class TwoSum {
   public static class Node {
      int data;
      Node next;
      Node prev;

      Node(int data) {
         this.data = data;
      }
   }

   // Given a sorted in non-decreasing order linkedlist , find the two node whose sum is eqauls to target.

   public static int[] sumTwoNode(Node head , int target){
   
      Node start = head;
      Node end = head;
      while (end.next!=null) {
         end= end.next;
      }

      while (start.data <end.data) {
         if(start.data + end.data == target){
            return new int[]{start.data , end.data};

         }
         else if(start.data + end.data > target){
end = end.prev;
         }
         else{
            start=start.next;
         }
      }



      return new int[]{-1,-1};
   }

   public static void main(String[] args) {
      Node a = new Node(3);
      Node b = new Node(5);
      Node c = new Node(13);
      Node d = new Node(15);
      Node e = new Node(20);
      Node f = new Node(30);

      a.next = b;
      b.next = c;
      c.next = d;
      d.next = e;
      e.next = f;

      b.prev = a;
      c.prev = b;
      d.prev = c;
      e.prev = d;
      f.prev = e;

      int[] result = sumTwoNode(a, 90);
      System.out.println("The 2 numbers are : "+ Arrays.toString(result));
   }

}
