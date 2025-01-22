// Tiling problem
// Given a "2 x n" board and tiles of size "2 X 1" , count the number of ways to tile the given board using the 2 x1 tiles.
// The tiles can be placed either horizontally or vertically.

import java.util.Scanner;

public class TillingProblem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of n :");
        int n = sc.nextInt();
        int count = NumberOfWays(n);
        System.out.println("Number of ways to tile the board is : "+count);
        
    }
    public static int NumberOfWays(int n){
       if(n==0||n==1){
        return 1;
       }
       
       //ways to tile the board with 2 x 1 tiles -- vertical choice
int way1 = NumberOfWays(n-1);

       //ways to tile the board with 1 x 2 tiles --  horizontal choice
int way2 = NumberOfWays(n-2);
       int Totalways = way1+way2;
       return Totalways;


    }


}
