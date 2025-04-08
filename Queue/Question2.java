import java.util.LinkedList;
import java.util.Queue;

public class Question2 {
    // Implement the stack using queues

    public static class Stack{
        Queue<Integer> mainQ = new LinkedList<>();
        Queue<Integer> helperQ = new LinkedList<>();
         

        void push(int val){ 
   mainQ.add(val);

        }

        void pop(){
            if(mainQ.isEmpty()){
                System.out.println("Stack is empty");
                return;
            }
           
            while (mainQ.size()>1) {
                helperQ.add(mainQ.remove());
            }
            mainQ.remove();

           Queue<Integer> temp = mainQ;
           mainQ = helperQ;
           helperQ = temp;


        }

        int peek(){
            if(mainQ.isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            while (mainQ.size()>1) {
                helperQ.add(mainQ.remove());
            }
            int top = mainQ.remove();
            helperQ.add(top);

    Queue<Integer> temp = mainQ;
mainQ = helperQ;
helperQ = temp;

            return top;
        }

        void display(){
            System.out.println(mainQ);
        }

        int getSize(){
            return mainQ.size();
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
           

        System.out.println(st.peek());
        st.display();
        st.pop();
        System.out.println(st.peek());
        st.display();

    }
    
}
