import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class ActivitySelectionProblem{

    // Given - start = [0,3,,1,8,5,5]  , end = [6,4,2,9,7,9] , 
    // soltuion tip - first sort according to end time with correspond start
    //   then look for count = 4
    public static void main(String args[]) {
        // Start and end times of activities
        int[] startArr = {0, 3, 1, 8, 5, 5};
        int[] endArr =   {6, 4, 2, 9, 7, 9};

        // Convert to ArrayLists for sorting by index
        ArrayList<Integer> start = new ArrayList<>();
        ArrayList<Integer> end = new ArrayList<>();

        for (int i = 0; i < startArr.length; i++) {
            start.add(startArr[i]);
            end.add(endArr[i]);
        }

        int maxActivity = MaxActivity(start, end);
        System.out.println("Maximum number of non-overlapping activities: " + maxActivity);
    }

    public static int MaxActivity(ArrayList<Integer> start, ArrayList<Integer> end) {
        ArrayList<Integer> idxArr = new ArrayList<>();

        // Fill index list
        for (int i = 0; i < start.size(); i++) {
            idxArr.add(i);
        }

        // Sort idxArr based on end time
        Collections.sort(idxArr, (a, b) -> end.get(a) - end.get(b));

        int maxActivity = 1;
        int lastEnd = end.get(idxArr.get(0));

        for (int i = 1; i < start.size(); i++) {
            int idx = idxArr.get(i);
            if (start.get(idx) >= lastEnd) {
                maxActivity++;
                lastEnd = end.get(idx);
            }
        }

        return maxActivity;




    }
}