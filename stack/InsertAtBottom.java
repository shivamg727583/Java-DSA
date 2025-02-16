import java.util.Stack;

public class InsertAtBottom {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println("Original Stack: " + st);

        Stack<Integer> updatedStack = InsertAtIndex(2, 10, st);

        System.out.println("Updated Stack: " + updatedStack);
    }

    // Function to insert an item at the given index
    public static Stack<Integer> InsertAtIndex(int index, int item, Stack<Integer> st) {
        if (index < 0 || index > st.size()) {
            System.out.println("Error: Invalid index!");
            return st;
        }

        Stack<Integer> tempStack = new Stack<>();

        // Pop elements until reaching the target index
        while (st.size() > index) {
            tempStack.push(st.pop());
        }

        // Insert the new item at the target index
        st.push(item);

        // Restore previous elements back to original stack
        while (!tempStack.isEmpty()) {
            st.push(tempStack.pop());
        }

        return st;
    }


    public static Stack<Integer> pushUsingRecursion(int idx , int item , Stack<Integer> st){
if(idx<0 || st.size()<idx){
    System.out.println("plx enter valid index");
    return st;
}



        return st;
    }
   
}
