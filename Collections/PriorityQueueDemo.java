import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

         // It adds elements based on priority internally (Min-Heap).
// But System.out.println() does NOT show sorted order.
// Only poll() or peek() shows correct priority-based access.

        pq.add(10);
        pq.add(3);
        pq.add(2);
        pq.add(5);
        pq.add(4);

        System.out.println("Simply print => "+pq);

        System.out.print("pop one by one => ");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll()+" ");
        }
       
    }
}
