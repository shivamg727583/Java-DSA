public class Question04 {

    // COvert uppercase to lowercase
    public static void main(String[] args) {
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " : " + (char)(i| ' ')+"    ");
            
        }
    }
}
