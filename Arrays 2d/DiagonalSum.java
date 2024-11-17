public class DiagonalSum {
    public static void main(String[] args) {
        int arr[][] ={{1, 2, 3, 4},
                      {5, 6, 7, 8},
                      {9, 10,11,12},
                      {13,14,15,16}};
        
        int ans = SumOfDiagonal(arr);
        System.out.println("Sum of diagonals is : "+ans);
    }
    public static int SumOfDiagonal(int arr[][]){
        int sum=0;
        int n = arr.length;
        int m = arr[0].length;
        if(m!=n){
            return 0;
        }

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {
                if(i==j){
                    sum+=arr[i][j];
                }
                else if(i+j==n-1){
                    sum+=arr[i][j];
                }
            }
            
        }
        return sum;
    }
}
