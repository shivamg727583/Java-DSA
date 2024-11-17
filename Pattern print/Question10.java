public class Question10 {
    public static void main(String[] args) {
        int n=5;


        // upper 

        for (int i = 1; i <= n; i++) {
            int space = n-i;

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
                
            }

            for (int j = 1; j <= space*2; j++) {
                System.out.print("  ");
               
        }
          
        for (int k = 1; k <= i; k++) {
            System.out.print("* ");
            }
            System.out.println();
}
    

/// lower 
    
    for (int i = n; i >0; i--) {
        int space = n-i;

        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
            
        }

        for (int j = 1; j <= space*2; j++) {
            System.out.print("  ");
           
    }
      
    for (int k = 1; k <= i; k++) {
        System.out.print("* ");
        }
        System.out.println();
}
}
}


///////// butterfly pattern

// *                 * 
// * *             * *
// * * *         * * *
// * * * *     * * * *
// * * * * * * * * * *
// * * * * * * * * * *
// * * * *     * * * *
// * * *         * * *
// * *             * *
// *                 *