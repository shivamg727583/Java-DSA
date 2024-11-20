// Question-2 : Swap two numbers without using 3rd variable


public class Question02 {
    public static void main(String[] args) {
        int a=3;
        int b=4;
        System.out.println("Before swapping");
        System.out.println("Value of a is "+a);
        System.out.println("Value of b is "+b);
        a=a+b; // a= 7;
        b=a-b; // b = 7-4 = 4
        a=a-b; // a = 7-3 = 4

        System.out.println("After swapping");
        System.out.println("Value of a is "+a);
        System.out.println("Value of b is "+b);
    }
}
