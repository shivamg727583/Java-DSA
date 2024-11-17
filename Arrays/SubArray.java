public class SubArray{
    public static void main(String[] args) {
        int arr[]={1, -2, 6, -1, 3 };
        int n = arr.length;
        int ts =0;
        for (int i = 0; i < n; i++) {
            int start =i;

            for (int j = i; j < arr.length; j++) {
           
                int end =j;
                ts++;
                for (int k = start; k <= end; k++) {
                
                    System.out.print(arr[k]+" ");                   
                }
             
                
               
                System.out.println();
                
            }
            System.out.println();
          
           
            
        }
        System.out.println("Total subarrays is : "+ts);

        
    }
}