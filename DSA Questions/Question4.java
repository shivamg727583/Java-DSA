/*2.Longest Common Prefix:
Given an array of strings, find the longest common prefix.
Example: Input: ["flower", "flow", "flight"], Output: "fl". */

public class Question4 {
    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(str));
                
            }
        
            private static char[] longestCommonPrefix(String[] str) {
              if (str.length == 0) {
                return new char[0];
                }
                String prefix = str[0];
                for (int i = 1; i < str.length; i++) {
                    
            }
}
