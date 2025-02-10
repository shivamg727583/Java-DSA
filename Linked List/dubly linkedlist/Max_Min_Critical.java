import java.util.ArrayList;

public class Max_Min_Critical {
    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    public static void MaxMinDistance(Node head) {
        if (head == null || head.next == null || head.next.next == null) {
            System.out.println("No critical points found");
            return;
        }

        ArrayList<Integer> criticalIndices = new ArrayList<>();
        Node temp = head.next;
        int index = 1;

        while (temp.next != null) {
            if ((temp.prev.data < temp.data && temp.data > temp.next.data) || // Local maxima
                (temp.prev.data > temp.data && temp.data < temp.next.data)) { // Local minima
                criticalIndices.add(index);
            }
            temp = temp.next;
            index++;
        }

        if (criticalIndices.size() < 2) {
            System.out.println("Not enough critical points found");
            return;
        }

        int minDist = Integer.MAX_VALUE;
        int maxDist = criticalIndices.get(criticalIndices.size() - 1) - criticalIndices.get(0);

        for (int i = 1; i < criticalIndices.size(); i++) {
            int dist = criticalIndices.get(i) - criticalIndices.get(i - 1);
            minDist = Math.min(minDist, dist);
        }

        System.out.println("Minimum distance: " + minDist);
        System.out.println("Maximum distance: " + maxDist);
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(5);
        Node d = new Node(3);
        Node e = new Node(2);
        Node f = new Node(7);
        Node g = new Node(8);
        Node h = new Node(9);
        Node i = new Node(1);
        Node j = new Node(10);

        a.next = b; b.next = c; c.next = d; d.next = e; e.next = f;
        f.next = g; g.next = h; h.next = i; i.next = j;
        j.next = null;

        b.prev = a; c.prev = b; d.prev = c; e.prev = d; f.prev = e;
        g.prev = f; h.prev = g; i.prev = h; j.prev = i;

        MaxMinDistance(a);
    }
}



// Critical point max and min distance
//   null <- 1 <=> 2 <=>  5 <=> 3 <=> 2 <=> 7 <=> 8 <=> 9 <=> 1 <=> 10 -> null.

// here 5 , 2 ,1 are citical points

// distance b/w critical points : (5,2) = 2 , (2,1) = 4, (5,1)= 6
// max distance = 6  (distance b/w nodes of critical)
// min distance = 2


//   A(n-1) < A(n) < A(n+1)  ==> Local maxima
//   A(n-1) > A(n) < A(n+1)  ==> Local minima
