public class BinaryStringProblem {
    public static void main(String[] args) {
        BinaryStrings(3, 0, "");

    }

    public static void BinaryStrings(int n, int lastPlace, String str) {

        if (n == 0) {
            System.out.println(str);
            return;
        }

        BinaryStrings(n - 1, 0, str + "0");
        if (lastPlace == 0) {
            BinaryStrings(n - 1, 1, str + "1");
        }
    }
}

// Binary String Problem :
// Print all binary strings of size N without consecutive ones.
// Ex-> n =2
// Output :
// 00 , 01 , 10 ,
// But 11 is not accept because 1 is come after 1 , so did not want this.
