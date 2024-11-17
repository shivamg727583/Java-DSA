import java.util.Arrays;

// Given a non-negative intergers representing an elvation map where the width of each bar is 1, compute how much water it can trap after raining.

// time complexity - O(n)

public class Trapping_Rainwater {
    public static void main(String[] args) {
        int[] height = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(TrapRain(height));

    }

    public static int TrapRain(int arr[]) {
// calculate left max boundry - array

    int[] leftMax = new int[arr.length];
    leftMax[0] = arr[0];
    for (int i = 1; i < arr.length; i++) {
        leftMax[i]= Math.max(arr[i], leftMax[i-1]);
        
    }

    // calculate right max boundry - array
        int[] rightMax = new int[arr.length];
        rightMax[arr.length-1] = arr[arr.length -1];
        for (int i = arr.length-2; i>=0; i--) {
            rightMax[i]= Math.max(arr[i], rightMax[i+1]);
            
        }
        // calculate the water trapped between left and right max boundry - array
        int waterTrapped = 0;
        for (int i = 0; i < arr.length; i++) {
            waterTrapped += Math.min(leftMax[i], rightMax[i]) - arr[i];

            
        }
        return waterTrapped;
    }
}

/// (waterlavel - baselevel/height)*weight = traped water

// 1. minimun no.of bars >= 2
// 2. Asc/ Desceneding ,nahi hona chahiye
// 3. Wl => min(max left, max height)
// 4. base level => height of bar
