import java.util.LinkedHashSet;

public class LinkedListHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> name = new LinkedHashSet<>();
        name.add("Shivam");
        name.add("Ravi");
        name.add("Shivam");
        name.add("Mohan");

        System.out.println(name);


    }
}
