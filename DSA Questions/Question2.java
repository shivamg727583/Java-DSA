/*2. Find Missing Number in Array:
An array contains numbers from 1 to n with one missing. Find the missing number.
Example: Input: [1, 2, 4, 6, 3, 7, 8], Output: 5. */

public class Question2 {
    public static void main(String[] args) {
        int arr[]= {1,2,4,6,3,5,8};
        int max = arr[0];
        int min=arr[0];
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if(arr[i]>max){
max=arr[i];
            } else if(arr[i]<min){
                min=arr[i];
            }
        }

        int sumOfAll =0;
        for (int i = min; i <= max; i++) {
          sumOfAll+=i;    
        }

        int missing = sumOfAll-sum;
        System.out.println("Missing number is : "+missing);
    }
}
