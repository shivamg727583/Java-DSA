import java.util.Arrays;

public class MinimumNo_Arraytoburst {

    // Q;3- Minimun no.of arrows to burst balloons (452)
    // Input -  points = {{10,16},{2,8},{1,6},{7,12}}
    // output - 2
    // explanation - Balloons can be burst by 2 arrows:
    // shoot an arrow at x = 6 , bursting the balloons [2,8] and [1,6],
    // shoot an arrow at x =11 , bursting the ballons [10,16] and [7,12]

    // input -  
    public static void main(String[] args) {
      int[][]   points = {{10,16},{2,8},{1,6},{7,12}};
      int arrows = MinimunArrow(points);
      System.out.println("Minimum arrows are : "+ arrows);
    }

    public static int MinimunArrow(int[][] arr){
       if (arr.length == 0) return 0;

        // Sort based on end point
        Arrays.sort(arr, (a, b) -> Integer.compare(a[1], b[1]));

        int arrows = 1;
        int lastEnd = arr[0][1];

        for (int[] a : arr) {
            if (a[0] > lastEnd) {
                arrows++;
                lastEnd = a[1];
            }
        }

        return arrows;


    }
}
