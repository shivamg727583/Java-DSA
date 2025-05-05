import java.util.HashMap;
import java.util.Map;

public class HashMapDemo{
    public static void main(String[] args) {
        Map<String ,Integer> mp = new HashMap<>();

        // Adding Element
        mp.put("Akash", 21);
        mp.put("Shivam", 20);
        mp.put("Ansh", 30);
        mp.put("Lav", 25);

        // Getting value of an key from the hashMap
        System.out.println(mp.get("Shivam")); // 20
        System.out.println(mp.get("Sg")); // null
        
        // changing / updating the value of a key in the hashMap
        mp.put("Shivam", 18);

        // removing a pari from the hashMap
        mp.remove("Ansh"); // Ansh pair removed
        System.out.println("After removing Ansh = "+mp);

        // checking if a key is in the HashMap
        System.out.println(" contain Shivam ? :  "+mp.containsKey("Shivam"));
        System.out.println(" contain Ansh ? :  "+mp.containsKey("Ansh"));

        // adding a new entry only if the new key does not exist already
        mp.putIfAbsent("Heera", 10);

        // Get all keys in the hashMap
        System.out.println("Key sets = "+mp.keySet());

        // get all value in the hashMap
        System.out.println("values sets = "+mp.values());

        // Get all entries in the hashMap
        System.out.println(mp.entrySet());

        // Traversing all entries of HashMap - multiple method

        for (String key : mp.keySet()) {
            // System.out.println("Age of "+key+" is : "+ mp.get(key));

            System.out.printf("Age of %s is %d\n" , key , mp.get(key));
        }

        // Or 2ND Method

        // for(Map.Entry<String,Integer> e : mp.entrySet()){
            
        //     System.out.printf("Age of %s is %d\n" , e.getKey() , e.getValue());
        // }

        // OR 3rd Method - using var , using writting specific data type

        for (var e : mp.entrySet()) {
             System.out.printf("Age of %s is %d\n" , e.getKey() , e.getValue());
            
        }

    }

}