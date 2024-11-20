public class EvenOdd {
    public static void main(String[] args) {
        int num = 40;
        int res=num & 1;
        if(res==1){
            System.out.println(num + " is odd");
        }
        else
        System.out.println(num +" is even");
    }
}
