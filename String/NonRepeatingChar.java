/*3. Find the First Non-Repeating Character
Explanation:
Find the first character in a string that does not repeat. Use a frequency map to count occurrences of each character.

Example:
Input: "swiss"
Output: "w" (The first non-repeating character is 'w') */

public class NonRepeatingChar{
    public static void main(String[] args) {
        String str = "swiss";
        char result = findNonRepeatingChar(str);
        System.out.println(result);
            }
        
            public static char findNonRepeatingChar(String str) {
               int[] frequency = new int[256]; // assuming ASCII
               
               for (int i = 0; i < str.length(); i++) {
                frequency[str.charAt(i)]++; // 
                }
                for (int i = 0; i < str.length(); i++) {
                    if (frequency[str.charAt(i)] == 1) {
                        return str.charAt(i);
                        }
                        }

                        return '\0'; // return null if no non-repeating character found

            }
            
}
