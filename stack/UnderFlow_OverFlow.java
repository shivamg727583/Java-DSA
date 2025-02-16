import java.util.Stack;

public class UnderFlow_OverFlow {
    public static void main(String[] args) {
         Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println("Original Stack: " + st);

    }
}

// Underflow - condition occured when if stack is empty  -> st.pop() or st.peek() - Get Empty stack Exception (Error)

// Overflow - orrcured when if stack is full and we are trying to push 
// Implement using arrays - size -> Fixed 