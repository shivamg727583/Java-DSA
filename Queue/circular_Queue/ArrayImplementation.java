class ArrayImplementation {

    public static class Queue {
        int data[] = new int[5]; // Fixed size queue
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
                rear = (rear + 1) % data.length;
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

            // Reset front and rear when queue becomes empty
            if (size == 0) {
                front = -1;
                rear = -1;
            }
        }

        int peek() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return Integer.MIN_VALUE;
            }
            return data[front];
        }

        void display() {
            if (size == 0) {
                System.out.println("Queue is empty");
                return;
            }

            System.out.print("Queue: ");
            for (int i = 0; i < size; i++) {
                System.out.print(data[(front + i) % data.length] + " ");
            }
            System.out.println();
        }

        int getSize() {
            return size;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.remove();
        q.add(6);
        
        q.display(); // Expected Output: 2 3 4 5 6
        System.out.println(q.peek()); // Expected Output: 2
    }
}
