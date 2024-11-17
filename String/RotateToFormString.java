/*10. Check if String can be Rotated to Form Another String
Explanation:
Check if one string can be obtained by rotating another. Concatenate one string to itself and check if the other string is a substring.

Example:
Input: "ABCD" and "CDAB"
Output: true (Rotating "ABCD" gives "CDAB")

Note: If input is "ABCD" and "ACBD", output is false. */


public class RotateToFormString {
    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "CDAB";
        String str3 = "ACBD";

        System.out.println(isRotation(str1, str2)); // true
        System.out.println(isRotation(str1, str3)); // false
    }

            
        
            public static boolean isRotation(String A, String B) {
                // Check if lengths are different
                if (A.length() != B.length()) {
                    return false;
                }
        
                // Concatenate A with itself and check if B is a substring
                String doubleA = A + A;
                return doubleA.contains(B);
            }
}
