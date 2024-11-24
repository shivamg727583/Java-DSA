/*1. Check for Palindrome:
Write a function to check if a given string is a palindrome.
Example: Input: "racecar", Output: true. */

public class Question3 {
    public static void main(String[] args) {
        String str1 ="madam";
        System.out.println(isPalindrome(str1)); // prints: true
            }
        
            private static boolean isPalindrome(String str1) {
                String str2="";
                
                for (int i = str1.length()-1; i>=0; i--) {
                    str2+=str1.charAt(i);
                }
              
                if(str1.equals(str2)){
                    return true;
                }
                else{
                    return false;
                }
               
            }
}
