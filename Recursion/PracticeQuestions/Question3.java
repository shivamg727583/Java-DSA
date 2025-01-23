
// Ques-3 : Write a program to find the lenght of the string using recursion.

public class Question3 {
    public static void main(String[] args) {
        System.out.println(findLength("Hello"));
        }
        public static int findLength(String str) {
            if (str.equals("")) {
                return 0;
            } else {
                return findLength(str.substring(1)) + 1; // recursive call
                // str.substring(1) + 1 => ello
                // str.substring(2) + 1 + 1 => llo 
                // str.substring(3) + 1 + 1 + 1  => lo
                // str.substring(4) + 1 + 1 + 1 + 1 => o
                // str.substring(5) + 1 + 1 + 1 + 1 + 1 => ""
                // return 0;
                // 
            }
            }
        
    }

