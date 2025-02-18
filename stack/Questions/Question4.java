package Questions;

import java.util.Arrays;
import java.util.Stack;

// Q-4 : Next greater element -   (If there is not greate element then print -1 else print next greater element)
// input -    1 3 2 1  8  6  3  4
// output -   3 8 8 8 -1 -1  4 -1  


public class Question4 {
    public static void main(String[] args) {
        int[] arr ={1,3,2,1,8,6,3,4};
        NextGreater(arr);
        
    }
    public static void NextGreater(int[]  arr){
        
        int max = 0;
// 3 
        for (int i = 0; i < arr.length; i++) { // i = 0 1
            for (int j = i+1; j < arr.length; j++) { // j = 2
                if(arr[i]<arr[j]){
                    arr[i] = arr[j];
                    break;
                }
                else{
                    arr[i] = -1;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
