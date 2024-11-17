/*
  Longest Common Prefix
Explanation:
Find the longest prefix shared by all strings in a list. Compare characters of each string one by one.

Example:
Input: ["flower", "flow", "flight"]
Output: "fl"

Note: If input is ["dog", "racecar", "car"], output is "" (no common prefix).
 */


public class LargestCommonPrefix {
    public static void main(String[] args) {
        String[] input = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(input)); // Output: "fl"
            }
        
            public static String longestCommonPrefix(String[] input) {
                if (input.length == 0) return "";
                String prefix = input[0];
                for (int i = 1; i < input.length; i++) {
                    while (input[i].indexOf(prefix) != 0) {
                        prefix = prefix.substring(0, prefix.length() - 1);
                        if (prefix.isEmpty()) return "";
                        }
                        }
                        return prefix;
                        }
                        }
