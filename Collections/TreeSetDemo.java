import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet();
        tree.add(3);
        tree.add(1);
        tree.add(7);
        tree.add(4);
        tree.add(2);
        System.out.println(tree);

        tree.remove(3);
        System.out.println(tree);

        System.out.println(tree.ceiling(3)); // print equal or next greate
        System.out.println(tree.floor(5));// print equal or next smaller

        System.out.println(tree.first());// print first (lowest) element
        System.out.println(tree.last()); // print last (highest) element
    }
}
