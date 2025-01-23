
// Question-4 : We are given a string S , we need to find the count of all contigous substrings starting and ending with the same character.
// Example : S = "abcab" , 
// There are 15 substrings of "abcab" : a,ab,abc,abca,abcab,b,bc,bca,bcab,c,ca,cab,a,ab,b . Out of the above substring ,the count of all contigous substrings starting and ending with the same character is 7.The contigous substrings are : "a","abca","b","bcab","c","a" and "b".
// So the output will be 7.


public class Question4 {
    public static void main(String[] args) {
        String s = "abcab";
        System.out.println(countSubstrings(s, 0, 0)); // Output: 7
    }

    public static int countSubstrings(String s, int start, int end) {
        if (start == s.length()) { 
            return 0; // Base case: If start reaches end of string, return 0
        }

        int count = 0;

        // If end index is valid and characters match, count this substring
        if (end < s.length() && s.charAt(start) == s.charAt(end)) {
            count = 1;
        }

        // Expand the substring by increasing the end index
        if (end + 1 < s.length()) {
            count += countSubstrings(s, start, end + 1);
        } 
        // Move to the next starting index
        else {
            count += countSubstrings(s, start + 1, start + 1);
        }

        return count;
    }
}
