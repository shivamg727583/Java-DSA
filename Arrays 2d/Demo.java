import java.util.Scanner;

public class Demo{
    public static void main(String[] args) {
        int arr[][] = new int[2][2];
        int row=arr.length;
        int col = arr[0].length;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j <col; j++) {
                System.out.println("Enter element of the ("+i+" , "+j+" )");
                arr[i][j]=sc.nextInt();
            }
            
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    
    }
}