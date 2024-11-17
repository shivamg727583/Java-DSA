public class CountingSort{
    public static void main(String args[]){
        int arr[]= {3,1,3,5,8,1,2,9,3,5};
       Counting(arr);
      for (int i : arr) {
        System.out.print(i+" ");
      }
            }
        
            public static void Counting(int[] arr) {
               int max = Integer.MIN_VALUE;
               for (int i = 0; i < arr.length; i++) {
                if(max<arr[i]){
                    max=arr[i];
                }
               }
               int[] count = new int[max+1];
              
               for (int i = 0; i < arr.length; i++) {
                count[arr[i]]++;
                }
                int j=0;
                for (int i = 0; i < count.length; i++) {
                    while(count[i]>0){
                        // System.out.print(i+" ");
                        arr[j]=i;
                        j++;
                        count[i]--;
                        }
                        }
                       
                     
        }
    
}