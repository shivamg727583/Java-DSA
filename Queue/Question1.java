import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Question1 {
    // Reverse the queue
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println("Original Queue : ");
        System.out.println(q);

        // while (q.size()>0) {
        //     st.push(q.poll());
        // }

        // while (!st.isEmpty()) {
        //     q.add(st.pop());
        // }

        System.out.println("After reverse Queue is : ");
        // System.out.println(q);
        
        System.out.println(reverseQ(q, 3));
       
    }

    //  reverse by k 
    public static Queue<Integer> reverseQ(Queue<Integer> q, int k){
        Stack<Integer> st = new Stack<>();
        int n = q.size(); // Store the original size

        // Step 1: Push first k elements into the stack
        for (int i = 0; i < k; i++) {
            st.push(q.poll());
        }
    
        // Step 2: Pop from stack and enqueue back
        while (!st.isEmpty()) {
            q.add(st.pop());
        }
    
        // Step 3: Move the remaining (n-k) elements to the back
        for (int i = 0; i < n - k; i++) {
            q.add(q.poll());
        }
        return q;
    }
}
