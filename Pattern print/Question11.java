public class Question11 {
    public static void main(String[] args) {
        int n=5;
        for (int j = 0; j <n; j++) {
            int space = n-j;
            for (int k = 0; k < space; k++) {
                System.out.print("  ");
                
            }
            for (int i = 0; i < n; i++) {
                System.out.print("* ");
                
            }
            System.out.println();
            
        }
    }
}


////////////  solid rhombus

// * * * * * 
// * * * * *
// * * * * *
// * * * * *
// * * * * *