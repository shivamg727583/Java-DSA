import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueDemo {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
    dq.add(1);
    dq.add(2);
    dq.addFirst(0);
    dq.addLast(4);
    System.out.println(dq);

    // dq.element();
    
    System.out.println(dq.reversed());
    }
}
