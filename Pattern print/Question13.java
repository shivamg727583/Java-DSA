public class Question13 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <= 5; i++) {
            int space = n-i;
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            
        }
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }
        for (int j = 2; j <= i; j++) {
            System.out.print("* "); 
        }
        
        System.out.println();

    }

    for (int i = n; i>0; i--) {
        int space = n-i;

        for (int j = 1; j<= space; j++) {
            System.out.print("  ");       
    }

    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }

    for (int j = 2; j <= i; j++) {
        System.out.print("* "); 
    }
    
    System.out.println();

}
}
}


//////////   Diamond pattern

//           * 
//         * * *
//       * * * * *
//     * * * * * * *
//   * * * * * * * * *
//   * * * * * * * * *
//     * * * * * * *
//        * * * * *
//          * * *
//            *