public class ArrayImplem {

    public static class Queue{
        private int[] data = new int[10];
        private int front = 0;
        private int rear = 0;
        private int size = 0;

        void add(int val){
            if(size == data.length){
                System.out.println("Queue is full");
                return;
            }
            data[rear] = val;
            rear = (rear + 1) % data.length;
            size++;
        }

        void remove(){
            if(size == 0){
                System.out.println("Queue is empty");
                return;
            }
            front = (front + 1) % data.length;
            size--;
        }

        int peek(){
            if(size == 0){
                System.out.println("Queue is empty");
                return -1;
            }
            return data[front];
        }

        void print(){
            for(int i = 0; i < size; i++){
                System.out.print(data[(front + i) % data.length] + " ");
            }
            System.out.println();
        }

        int size(){
            return size;
        }
       

    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(7);
        q.add(3);
        q.add(4);
q.print();
q.remove();
q.print();
    }
}
