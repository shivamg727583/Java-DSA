
// Write a recursive function to generate all possible subsequences of a given string.
//     Input: "abc"
//    Output: ["", "a", "b", "c", "ab", "ac", "bc", "abc"]

public class SequnceOfString {
    public static void main(String[] args) {
        String str = "abc";
        generateSubsequence(str, "");
    }

    public static void generateSubsequence(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // Include the first character
        generateSubsequence(str.substring(1), ans + str.charAt(0));

        // Exclude the first character
        generateSubsequence(str.substring(1), ans);
    }
}
