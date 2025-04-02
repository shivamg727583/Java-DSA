public class ArrayImplementation {
    
    public static class Queue {
        int[] data = new int[10];
        int front = -1;
        int rear = -1;
        int size = 0;
        
        void add(int val) {
            if (size == data.length) {
                System.out.println("Queue is full");
                return;
            }
            if (size == 0) {
                front = 0;
                rear = 0;
            } else {
                rear = (rear + 1) % data.length; // Corrected position update
            }
            data[rear] = val;
            size++;
        }

        void remove() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return;
            }
            front = (front + 1) % data.length;
            size--;
            if (size == 0) {  // Reset queue when empty
                front = -1;
                rear = -1;
            }
        }

        int peek() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            return data[front];
        }

        void display() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return;
            }
            for (int i = 0; i < size; i++) {
                System.out.print(data[(front + i) % data.length] + " ");
            }
            System.out.println();
        }

        boolean isEmpty() {
            return size == 0;
        }

        boolean isFull() {
            return size == data.length;
        }

        int getSize() {  // Renamed to avoid conflict
            return size;
        }
    }
     
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        q.display(); // Output: 1 2 3 4

        System.out.println("Size: " + q.getSize()); // Output: 4
    }
}
