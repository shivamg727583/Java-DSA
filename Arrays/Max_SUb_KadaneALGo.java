public class Max_SUb_KadaneALGo {
    public static void main(String[] args) {
        int arr[] ={-2,-3,4,-1,-2,1,5,-3};
        Kadanes(arr);
    }
    public static void Kadanes(int arr[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<arr.length;i++){
            cs=cs+arr[i];
            if(cs<0){
                cs=0;
            }
            ms=Math.max(cs, ms);
    }
    System.out.println("Max subarray sum is :"+ms);
}
}


// MAx Subaray using Kadane Algorithm -- time complexity - O(n)
//  arr[] = {-2,-3,4,-1,-2,1,5,-3};
// if current sum is less than 0 then we will take 0

// cs - 0 | 0 | 4 | 3 | 1 | 2 | 7 | 4 |
// ms - 0 | 0 | 4 | 4 | 4 | 4 | 7 | 7 |