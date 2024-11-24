/*2.Fibonacci Sequence:
Print the Fibonacci sequence up to the nth term.
Example: Input: 5, Output: 0, 1, 1, 2, 3.
 */

public class Question8 {
    public static void main(String[] args) {
        int n=5;
        int pre=0, curr=1;
        int next=0;
        System.out.print(pre+" "+curr+" ");
        for (int i = 0; i < n-2; i++) {
            next = pre + curr;
            pre = curr;
            curr = next;
            System.out.print(curr+" ");
        }

        
    }
}
