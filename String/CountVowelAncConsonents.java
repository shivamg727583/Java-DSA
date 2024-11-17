/*4. Count the Number of Vowels and Consonants
Explanation:
Count the vowels (a, e, i, o, u) and consonants in a string. Ignore non-alphabetic characters.

Example:
Input: "Hello World"
Output: Vowels: 3, Consonants: 7 */

public class CountVowelAncConsonents {
    public static void main(String[] args) {
        String  str ="Hello World";
        int vowelsCount =0;
        int consonantsCount =0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'|| ch == 'u'|| ch == 'A'|| ch == 'E'|| ch == 'I'|| ch == 'O'|| ch == 'U'){
                vowelsCount++;
            }
            else{
                if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' || ch >= 'Z')){
                    consonantsCount++;
                }
            }
            

    }
    System.out.println("NO. of vowels : "+vowelsCount);

    System.out.println("NO. of consonents : "+ consonantsCount);

    
}
}
