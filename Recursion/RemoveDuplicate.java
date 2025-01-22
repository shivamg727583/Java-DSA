public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "apnanacollege";
        System.out.println("Filter string is : " );
        StringBuilder result = RemoveDuplicateString(str, 0, new StringBuilder(), new boolean[256]);
        System.out.println("Filter string is : " + result.toString());
    }
        
    public static StringBuilder RemoveDuplicateString(String str, int idx, StringBuilder newStr, boolean[] map) {
        if(idx == str.length()){
            return newStr;
        }
        char currChar = str.charAt(idx);
        if(!map[currChar]){
            map[currChar] = true;
            newStr.append(currChar);
        }
        RemoveDuplicateString(str, idx + 1, newStr, map);
        return newStr;
    }
}
