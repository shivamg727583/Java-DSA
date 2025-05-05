import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class Question1{

     // Q-1- Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
     //  Input :  n = 6 , nums = [100,4,200,1,3,2]
     // output : 4

     // input : n = 10 , nums=[0,3,7,2,5,8,4,6,0,1]
    //  output : 9
    public static void main(String args[]){
      int arr[] = {0,3,7,2,5,8,4,6,0,1};
      System.out.println("Length of largest consecutive elem : "+ largestConsecutive(arr));

    }

    public static int largestConsecutive(int nums[]){
        HashSet<Integer> set = new HashSet<>();

        for (int num: nums) {
            set.add(num);
        }

        
        int count = 0;

        for (int val : set) {
            if(!set.contains(val-1)){ // num is starting point of a sequnce
 int currNum = val;
 int currSteak = 1;
 while (set.contains(currNum+1)) {
    currNum++;
    currSteak++;
    
 }
 count =  Math.max(currSteak, count);

            }
        }

        return count;
    }
}