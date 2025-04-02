import java.util.Stack;

public class Prefix {
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        System.out.println("Infix form : " + str);
        System.out.println("Prefix form : " + infixToPrefix(str));

    }

    public static String infixToPrefix(String str) {
        Stack<String> st = new Stack<>();
        Stack<Character> op = new Stack<>();

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                String s = "" + c;
                st.push(s);
            } else if (op.size() == 0 || c == '(' || op.peek() == ')') {
                op.push(c);
            } else if (c == ')') {
                while (op.peek() != '(') {
                    String v2 = st.pop();
                    String v1 = st.pop();
                    char o = op.pop();
                    String t = o + v1 + v2;
                    st.push(t);

                    op.push(c);
                }

                if (c == '*' || c == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {
                        String v2 = st.pop();
                        String v1 = st.pop();
                        char o = op.pop();
                        String t = o + v1 + v2;
                        st.push(t);

                        op.push(c);
                    } else
                        op.push(c);
                }

            }

        }

        while (st.size() > 1) {
            String v2 = st.pop();
            String v1 = st.pop();
            char o = op.pop();
            String t = o + v1 + v2;
            st.push(t);

        }

        return st.toString();
    }
}
