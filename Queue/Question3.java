import java.util.Stack;

public class Question3 {

// Question-02 - Implement queue using Stacks

public static class Queue{
    Stack<Integer> mainStack = new Stack<>();
    Stack<Integer> helperStack = new Stack<>();

    void add(int val){
   mainStack.push(val);
    }

    int remove(){
if(mainStack.isEmpty()){
    return -1;
}

while (mainStack.size()>1) {
    helperStack.push(mainStack.pop());
}
 
int top = mainStack.pop();

while (!helperStack.isEmpty()) {
    mainStack.push(helperStack.pop());
}

return top;
    }
    
    int peek(){

        if(mainStack.isEmpty()){
            return -1;
        }
        
        while (mainStack.size()>1) {
            helperStack.push(mainStack.pop());
        }
         
        int top = mainStack.peek();
        helperStack.push(mainStack.pop());
        
        while (!helperStack.isEmpty()) {
            mainStack.push(helperStack.pop());
        }
        
        return top;
    }

    void display(){
        System.out.println(mainStack);
    }

}
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        q.display();
        System.out.println(q.peek());
        q.remove();
        q.display();
        System.out.println(q.peek());
    

    }
}
