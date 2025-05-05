import java.util.HashMap;
import java.util.Scanner;

public class IsomorphicString {

    // Given 2 strings s and t , determine if they are isomorphic.
    // two srtings s and t are isomorphic , if the characters in s can be replaced to get t.

    // All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

    // input - aab  ,  xxy   ;       output - true
    // input - abcdec  ,  viouog  ;     output - false
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.println("Enter 1st string : ");
String s = sc.nextLine();
System.out.println("Enter 2nd string : ");

String t = sc.nextLine();

System.out.println("Strings are isomorphic ? : "+ isIsomorphic(s, t));
        
    }

    public static boolean isIsomorphic(String s, String t){
        if(s.length()!= t.length()) return false;
        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(map.containsKey(c1)){
                if(map.get(c1)!= c2){
return false;
                }
            }
            else{
                map.put(c1, c2);
            }
        }

        return true;
    }
}
