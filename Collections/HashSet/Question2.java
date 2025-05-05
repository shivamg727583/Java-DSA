import java.util.HashSet;

public class Question2 {

    // Question-1 : U are given n distinct pairs. Each pair is numberes from 1 to n
    // . All the these pairs are initially put in a bag. U need to pair up each
    // number , U take numbers one by one frmo the bag u look whether the pair of
    // this number has already been taken out of the bag or not ,If not,u put the
    // current number on the table in front of him, Otherwise u put both numbers
    // from the pair aside . Print the maximum number of numbers that were on the
    // table at the same time.
    // Input : 1 , 11
    // output : 1

    // input: 3 , 2 1 1 3 2 3
    // output : 2
    public static void main(String[] args) {
        int arr[] = { 2, 1, 1, 3, 2, 3 };
        System.out.println("Max len : " + MaxNumberOnTable(arr));

    }

    public static int MaxNumberOnTable(int[] arr) {
        HashSet<Integer> table = new HashSet<>();
        int maxSize = 0;

        for (int i = 0; i < arr.length; i++) {
           
            if (!table.contains(arr[i])) {
                table.add(arr[i]);
            } else {
                table.remove(arr[i]);
            }

            int size = table.size();

            maxSize = Math.max(maxSize, size);
        }
        return maxSize;
    }
}
