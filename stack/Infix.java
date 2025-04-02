import java.util.Stack;

public class Infix {
    public static void main(String[] args) {
        String str = "8-5+3*4/6";
        System.out.println("Evaluation is: " + InfixEvaluation(str));
    }

    public static int work(char ch, int v1, int v2) {
        return switch (ch) {
            case '+' -> v1 + v2;
            case '-' -> v1 - v2;
            case '*' -> v1 * v2;
            case '/' -> v1 / v2;
            case '^' -> (int) Math.pow(v1, v2);
            default -> 0;
        };
    }

    public static int precedence(char ch) {
        return switch (ch) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> 0;
        };
    }

    public static int InfixEvaluation(String str) {
        Stack<Integer> val = new Stack<>();
        Stack<Character> operation = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                val.push(ch - '0'); // Push the current number
            } else if (ch == '(') {
                operation.push(ch); // Push '(' to stack
            } else if (ch == ')') {
                while (!operation.isEmpty() && operation.peek() != '(') {
                    int v2 = val.pop();
                    int v1 = val.pop();
                    int output = work(operation.pop(), v1, v2);
                    val.push(output);
                }
                operation.pop(); // Pop '('
            } else { // Operator encountered
                while (!operation.isEmpty() && precedence(ch) <= precedence(operation.peek())) {
                    int v2 = val.pop();
                    int v1 = val.pop();
                    int output = work(operation.pop(), v1, v2);
                    val.push(output);
                }
                operation.push(ch); // Push the current operator to stack
            }
        }

        // Evaluate remaining operators in the stack
        while (!operation.isEmpty()) {
            int v2 = val.pop();
            int v1 = val.pop();
            int output = work(operation.pop(), v1, v2);
            val.push(output);
        }

        return val.peek();
    }
}
