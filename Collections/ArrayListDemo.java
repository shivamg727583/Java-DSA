import java.util.ArrayList;

public class ArrayListDemo{
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<>();

        // to add elements
        list.add("tv");
        list.add("fridge");
        list.add("washing machine");
        list.add("bulbs");
        list.add("smartphone");

        // to add at specific index
        list.add(1,"water");

        System.out.println(list);

        list.set(3, "machine");

        System.out.println(list);

        System.out.println("idx of last -> "+ list.indexOf("machine"));

        System.out.println("contains or not : "+ list.contains("machine"));

    }
}