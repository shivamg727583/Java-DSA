public class Min_MaxSubArray {
    public static void main(String[] args) {
        int[] arr = {1, -2, 6, -1, 3 };

        int sum=0;
        int maxSum =0;
        int MinSum=arr[0];

        for (int i = 0; i < arr.length; i++) {
            int start =i;

            for (int j = i; j < arr.length; j++) {
           sum=0;
                for (int k = start; k <= j; k++) {
                System.out.print(arr[k]+" ");
                   sum+=arr[k];              
                }
             if(sum>maxSum){
                maxSum=sum;
             }
             else if(sum<MinSum){
                MinSum=sum;
             }
                
               
                System.out.println();
                
            }
            System.out.println();
          
           
            
        }
        System.out.println("MAx Sum is : "+maxSum);
        System.out.println("Min Sum is : "+MinSum);

       
      
    }
}


/// brute force
