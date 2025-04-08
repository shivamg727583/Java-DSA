import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Question5 {

    // Reorder queue (interleave 1st half with 2nd half) but using stack not array

    //  input ->  q =  1 2 3 4 5 6 7 8
    // Output ->  q = 1 5 2 6 3 7 4 8   
    
    // exlaination -> first q divide half into 2 parts as (1,2,3,4) and (5,6,7,8) then connect fisrt elem from both then 2nd from both and contiue till all elements end.


    public static Queue<Integer> reorderQ(Queue<Integer> q){
        Stack<Integer> firstHalfStack = new Stack<>();
        Stack<Integer> secHalfStack = new Stack<>();


        int size = q.size();
        int half = size/2;

        for(int i=0;i<half;i++){
            firstHalfStack.push(q.remove());
        }
        for(int i=0;i<half;i++){
            secHalfStack.push(q.remove());
        }

       

        Queue<Integer> res = new ArrayDeque<>();
        Stack<Integer> temp = new Stack<>();



        while (!firstHalfStack.isEmpty() && !secHalfStack.isEmpty()) {
            temp.push(secHalfStack.pop());
            temp.push(firstHalfStack.pop());
            
        }

       while (!temp.isEmpty()) {
        res.add(temp.pop());
        
       }



        return res;
    }
    
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);

        System.out.println("Before q : "+ q);
        Queue<Integer> ans = reorderQ(q);
        System.out.println("After reorder q : "+ ans);
        
    }
}
