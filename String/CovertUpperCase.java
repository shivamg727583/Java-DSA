// Question :-
// For a given string convert each the fisrt letter of each word to Uppercase;
// and the rest of the letters to lowercase.
// Example: "hello world" -> "Hello World"



public class CovertUpperCase {
    public static void main(String[] args) {
        String str = "Hello, world! i am shiVAm gupta";
        String[] words = str.split(" ");
        for (String word : words) {
            System.out.print(word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase()+" ");
        }
        System.out.println();

        System.out.println("String after convertion : "+ToUpperCase(str));
    }

    public static String ToUpperCase(String str){
        StringBuilder sb=new StringBuilder();
        sb.append(Character.toUpperCase(str.charAt(0)));
        for(int i=1;i<str.length();i++){

            if(str.charAt(i)== ' ' && i< str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
 else {
    sb.append(Character.toLowerCase(str.charAt(i)));
 }
           
            }
            return sb.toString();

    }
}
