import java.util.HashMap;

public class ValidAnagram {

    // Valid Anagram -  when 2 strings have same no. of frequency of letter , then both are called Anagram;
    // Input ->  s= silent , t = listen
    // output -> true
    public static void main(String[] args) {
        String s = "silent";
        String t = "listen";
        System.out.println("IS ANAGRAM ? = "+isAnagramByMap2(s, t));
        
    }

    // Using array
    public static boolean isAnagram(String s, String t){
        int[] freqA = new int[26];

        if(s.length()!=t.length()) return false;

        for(int i=0;i<s.length();i++){
            freqA[s.charAt(i)-'a']++;
            freqA[t.charAt(i)-'a']--;

        }
        

      for(int x:freqA){
        if(x!=0) return false;
      }

        return true;
    }

    // using 2 hashmap
    public static boolean isAnagramByMap(String s,String t){
        HashMap<Character, Integer> freqA = new HashMap<>();
        HashMap<Character, Integer> freqB = new HashMap<>();

        if(s.length()!=t.length()) return false;

        for (int i = 0; i < s.length(); i++) {
            freqA.put(s.charAt(i), freqA.getOrDefault(s.charAt(i), 0)+1);
            freqB.put(t.charAt(i), freqB.getOrDefault(t.charAt(i), 0)+1);

        }

       
        return  freqA.equals(freqB);

    }


    // using 1 hashmap , reduce space complexity
    public static boolean isAnagramByMap2(String s, String t){
        if(s.length()!=t.length()) return false;

        HashMap<Character,Integer> freq = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i), 0)+1);
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (!freq.containsKey(c)) return false;
            freq.put(c, freq.get(c) - 1);
            if (freq.get(c) < 0) return false;
        }

      

return true;

    }
}
