import java.util.Stack;

public class RemoveAtBottom {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println("Original Stack: " + st);

        Stack<Integer> updatedStack = remove(st,1);

        System.out.println("Updated Stack: " + updatedStack);
        
    }
    public static Stack<Integer> remove(Stack<Integer> st, int index){
        if (index < 0 || index > st.size()) {
            System.out.println("Error: Invalid index!");
            return st;
        }

        Stack<Integer> rt = new Stack<>();
while (st.size()>index+1) { // since 0-based index 
    rt.push(st.pop());
}

st.pop();
System.out.println("   "+st+"     ");

while (!rt.isEmpty()) {
    st.push(rt.pop());
}

        return st;
    }
}
