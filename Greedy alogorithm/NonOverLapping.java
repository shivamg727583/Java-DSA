import java.util.Arrays;

public class NonOverLapping {
    public static void main(String[] args) {
        int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};
        int removed = eraseOverLapInterval(intervals);
        System.out.println("removed intervals are : "+ removed);
    }

    public static int eraseOverLapInterval(int[][] intervals){
        Arrays.sort(intervals , (a,b)-> a[1]-b[1]);
   
        int removed = 0;
        int lastEnd = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if(intervals[i][0] < lastEnd){ // overlap
                removed++;
            }
            else{
                lastEnd = intervals[i][1];
            }
        }




        return removed;


    }
}
