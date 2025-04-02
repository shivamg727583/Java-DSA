
import java.util.*;

public class Ques1 {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> h = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(5);
        q.add(6);

        while (!q.isEmpty()) {
            
            h.add(q.peek());
            System.out.println(q.peek());
            q.remove();
            
        }
        while (!h.isEmpty()) {
            q.add(h.poll());
        }
        System.out.println(q);
        System.out.println(h);



    }
}
