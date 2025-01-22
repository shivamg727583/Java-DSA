    // find index of last occurence of target , it doesn't exist then return -1.
// if it exists then return the index of last occurence of target

public class LastOccurence {
    public static void main(String[] args) {
        int arr[] = {1,3,5,6,2,6,8,5};
        int target = 6;
        int result = lastOccurence(arr, target , arr.length-1);
        System.out.println("Last Occurence of "+target+" is at index "+result);
    }
    public static int lastOccurence(int arr[], int target, int n){
        if(arr[n]==target){
            return n;
        }
        else if(n==-1){
            return -1;
        }
        else {
            return lastOccurence(arr, target, n-1);
        }

    }
}
