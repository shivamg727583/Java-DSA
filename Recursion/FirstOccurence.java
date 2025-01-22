public class FirstOccurence {

    // find index of 1st occurence of target , it doesn't exist then return -1.
    public static void main(String[] args) {

        int arr[] = { 9, 3, 4, 5, 6, 8, 5, 2 };
        int target = 8;
        int result = firstOcc(arr, target, 0, arr.length - 1);
        System.out.println("First Occurence of " + target + " is " + result);
    }

    public static int firstOcc(int arr[],int target,int i, int n) {
if(arr[i]==target){
    return i;
}
else if(i==n-1){
    return -1;
    }else{
        return firstOcc(arr, target, i+1, n);
        }

    }
}
