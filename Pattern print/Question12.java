public class Question12 {
    public static void main(String[] args) {
        int n=5;

        for (int i = 1; i <= 5; i++) {
            int space = n-i;
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <=n; j++) {
                if(j==1 || j==n|| i==1 || i==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            
        }
    }
}


 ///////      hollow rhombus



//         * * * * * 
//       *       * 
//     *       * 
//   *       * 
// * * * * * 