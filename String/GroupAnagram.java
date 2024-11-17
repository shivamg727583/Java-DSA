/*8. Group Anagrams
Explanation:
Group words that are anagrams of each other into separate lists. Use a sorted version of each word as a key in a hash map.

Example:
Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
Output: [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]] */

public class GroupAnagram {
    public static void main(String[] args) {
        String[] str ={"eat", "tea", "tan", "ate", "nat", "bat"};
        groupAnagrams(str);
       
                
            }
        
            public static void groupAnagrams(String[] str) {
               int n = str.length;
               boolean[] visited = new boolean[n];
               for (int i = 0; i < n; i++) {
               if (!visited[i]) {
                // Start a new group for the current string
                System.out.print("[");
                System.out.print(str[i]);
                visited[i] = true;
                
                for (int j = i + 1; j < n; j++) {
                    if (!visited[j] && isAnagram(str[i], str[j])) {
                        System.out.print(", " + str[j]);
                        visited[j] = true;
                    }
                }
                System.out.println("]");
            }
        }
            }

            public static boolean isAnagram(String str1,String str2){
                if(str1.length()!=str2.length()){
                    return false;
                    }
                    int[] count=new int[256];
                    for(int i=0;i<str1.length();i++){
                        count[str1.charAt(i)]++;
                        count[str2.charAt(i)]--;
                        }
                        for(int i=0;i<256;i++){
                            if(count[i]!=0){
                                return false;
                                }
                                }
                                return true;


            }
}
