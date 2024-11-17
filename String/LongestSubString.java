/* Longest Substring Without Repeating Characters
Explanation:
Find the length of the longest substring in which no characters repeat. Use a sliding window to track the substring.

Example:
Input: "abcabcbb"
Output: 3 (The longest substring without repeating characters is "abc")

 */

public class LongestSubString {
    public static void main(String[] args) {
        String str = "abcdabecbb";
        System.out.println(longestSubString(str));
        System.out.println(String.valueOf(str.charAt(4)));
            }

        
        
            private static int longestSubString(String str) {
             StringBuilder sb = new StringBuilder();
             int maxLength = 0;
             for (int i = 0; i < str.length(); i++) {
                if (sb.indexOf(String.valueOf(str.charAt(i))) == -1) {
                    sb.append(str.charAt(i));
                    maxLength = Math.max(maxLength, sb.length());
                    }
                     else
                    sb.deleteCharAt(sb.indexOf(String.valueOf(str.charAt(i))));
                    }
                    return maxLength;
               
            }
}
