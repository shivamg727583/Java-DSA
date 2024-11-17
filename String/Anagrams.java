/*5. Check for Anagrams
Explanation:
Two strings are anagrams if they contain the same characters in the same frequency, but possibly in different orders.

Example:
Input: "listen" and "silent"
Output: true (They are anagrams) */

public class Anagrams {
    public static void main(String[] args) {
        String str1 ="listen";
        String str2 = "silent";
        System.out.println(isAnagram(str1, str2)); // prints: true
            }
        
            private static boolean isAnagram(String str1, String str2) {
                if (str1.length() != str2.length()) {
                    return false;
            }
            int[] Afreq = new int[256];
            int[] Bfreq = new int[256];

            for (int i = 0; i < str1.length(); i++) {
                
                Afreq[str1.charAt(i)]++;
            }

            for (int i = 0; i < str2.length(); i++) {
                Bfreq[str2.charAt(i)]++;
            }

            for (int i = 0; i < Bfreq.length; i++) {
                if(Afreq[i]!=Bfreq[i]){
                    return false;
                }
            }
            return true;


        }

}
