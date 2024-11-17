public class StringCOmpression {
    public static void main(String[] args) {
        String str = "aaabbcccddeeeee";
        String compressed = compressString(str);
        System.out.println(compressed);
            }
         
            public static String compressString(String str) {
              StringBuilder sb = new StringBuilder();
              int count = 1;
              for (int i = 0; i < str.length(); i++) {
                if (i + 1 < str.length() && str.charAt(i) == str.charAt(i+1)){
                    count++;
                }
                else{
                    sb.append(str.charAt(i));
                    if(count>1)
                  {
                    sb.append(count);
                  }
                    
count=1;
                }
                
              }
              return sb.toString();
            }
}
