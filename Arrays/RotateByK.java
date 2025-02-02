import java.util.Arrays;

public class RotateByK {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6,7,8,9};
        int k =3;
        System.out.println("Array before rotate  : "+Arrays.toString(arr));
rotate(arr, k);
        System.out.println("Array after rotate by "+k+" : "+Arrays.toString(arr));
    }
    public static void reverse(int arr[],int a,int b){
        int i=a;
        int j =b;
        while (i<j) {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
        return;
    }

    public static void rotate(int arr[],int k){
        int n = arr.length;
        k = k%n;

        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
    }
}
