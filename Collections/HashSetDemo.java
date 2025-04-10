import java.util.Arrays;
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(2);
        set.add(4);
        set.add(6);
        set.add(4); /// duplicate , ingore 

        System.out.println(set);

        set.remove(4); // enter object which remove,  not index

        System.out.println(set);
        System.out.println(set.contains(2));

        Integer[]  arr = set.toArray(new Integer[0]); // convert into arr
        System.out.println(Arrays.toString(arr));
    }
}
