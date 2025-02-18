package Questions;

import java.util.Stack;

// Q-1 Balanced brackets : -
// check whether a given bracket sequence is balanced or not 

public class Question1 {
    public static void main(String[] args) {
        String str = "(({{[}}]))(";
        boolean ans = isBalanced(str);
        System.out.println("Is balanced : " + ans);
    }

    public static boolean isBalanced(String str) {
        Stack<Character> st = new Stack<>();

        for (char c : str.toCharArray()) {
            // If the character is an opening bracket, push it onto the stack
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } 
            // If it's a closing bracket, check if it matches the top of the stack
            else if (c == ')' || c == '}' || c == ']') {
                if (st.isEmpty()) {
                    return false; // No matching opening bracket
                }

                char top = st.pop();
                // Check if the closing bracket matches the top of the stack
                if ((c == ')' && top != '(') || 
                    (c == '}' && top != '{') || 
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        // If the stack is empty, the brackets are balanced; otherwise, they are not
        return st.isEmpty();
    }
}
