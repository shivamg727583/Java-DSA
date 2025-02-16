import java.util.Scanner;
import java.util.Stack;

public class InputStack {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n;
        System.out.println("Enter the Number of elements u want to insert : ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter "+i+" Element : ");
            int x = sc.nextInt();
            st.push(x);
            
        }
        System.out.println("Elements = "+st);

        // reverse order
        Stack<Integer> rt = new Stack<>();
        while (st.size()>0) {
            //  use of peek and pop()
            
            // int x = st.peek();
            // rt.push(x);
            // st.pop();

            // only by using pop()

            rt.push(st.pop());
            
        }

        System.out.println("Reverse order : "+rt);
        System.out.println("\n recursion : ");
        Display(rt);
    }

    public static void Display(Stack<Integer> st){
        int top = st.pop();
        System.out.print(top+" ");
        Display(st);
        st.push(top);
    }

  
}
