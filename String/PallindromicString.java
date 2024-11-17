public class PallindromicString{
    public static void main(String args[]){
        String str = "madam"; // racecar , noon
        System.out.println(isPallindromic(str));
            }
        
            public static boolean isPallindromic(String str) {
               int n = str.length();
               for (int i = 0; i < n/2; i++) {
                if (str.charAt(i) != str.charAt(n-i-1)) {
                    return false;
                
               }
               
            }
            return true;
}}