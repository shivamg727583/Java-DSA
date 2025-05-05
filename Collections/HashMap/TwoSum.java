import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
  public static void main(String[] args) {
    int nums[] = {2,78,11,7};
    
    int ans[] = SumUsingMap(nums, 9);
    System.out.println("Indices are : "+ Arrays.toString(ans));
  }  

  public static int[] Sum(int nums[] , int target){
    for (int i = 0; i < nums.length; i++) {
        for (int j = i+1; j < nums.length; j++) {
            if(target == nums[i]+nums[j]){
                return new int[]{i,j};
            }
        }
    }

    return new int[]{-1};

  }

  public static int[] SumUsingMap(int[] nums, int target){
    HashMap<Integer , Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int partner = target - nums[i];
      if(map.containsKey(partner)){
        int idx = map.get(partner);
        return new int[]{idx , i};
      }

      map.put(nums[i], i);
    }

    return new int[]{-1};
  }

}
