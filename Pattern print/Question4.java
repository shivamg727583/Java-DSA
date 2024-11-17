import java.util.Scanner;

// Print Character pattern

// A 
// B C
// D E F
// G H I J



public class Question4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter  no. of rows :: ");
        int n = sc.nextInt();
char ch ='A';
        for(int i=0;i<n;i++){
            for (int j = 0; j <=i; j++) {
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
