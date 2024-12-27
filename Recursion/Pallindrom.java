
// Write a recursive function to check if a given string is a palindrome.
//    Input: "madam"
//   Output: true

public class Pallindrom {
    public static void main(String[] args) {
        System.out.println(isPallindromic("madam"));  // true
        
    }
    public static boolean isPallindromic(String str){
        if(str.length() == 0 || str.length() == 1){
            return true;
            }
            if(str.charAt(0) == str.charAt(str.length()-1)){
                return isPallindromic(str.substring(1, str.length()-1));
                }
                else{
                    return false;
                    }
    }
}
