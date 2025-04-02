import java.util.ArrayDeque;
import java.util.Deque;

public class DequeSDT {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(1);
        dq.addFirst(2);
        dq.addFirst(3);
        dq.addLast(4);
        System.out.println(dq);
        dq.remove(); // remove first element
        
        System.out.println(dq);
    }
}
