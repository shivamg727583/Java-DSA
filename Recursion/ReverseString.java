public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reverseString(str));
            }
        
            public static String reverseString(String str) {
                if(str.isEmpty()){
                    return str;
                }
              return reverseString(str.substring(1)) + str.charAt(0);

            }
}
