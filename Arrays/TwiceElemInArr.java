public class TwiceElemInArr {

    public static void main(String[] args) {
        int nums[]={1,2,3,2};
        int n=nums.length;
        int count=0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if(nums[i]==nums[j] && i!=j){
                    count++;
                }
            }
            
        }
        if(count>0){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        
    }
    
}