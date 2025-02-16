import java.util.Stack;

public class RevrsePrintStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println("Original Stack: " + st);

       reverse(st);

        // System.out.println("Reverse Stack: " + updatedStack);
    }
    public static void reverse(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
   int top = st.pop();
   System.out.print(top + " ");
reverse(st);
st.push(top);


    }
}
