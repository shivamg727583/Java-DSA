public class InsertionSort {
    public static void main(String[] args) {
        int arr[] ={3,1,8,5,2,8,7};
        InsertionSorting(arr);
                for (int i : arr) {
                    System.out.print(i+" ");
                }
            }
        
            public static void InsertionSorting(int[] arr) {
                for (int i = 1; i < arr.length; i++) {
                  int curr =arr[i];
                  int prev = i-1;
                  // finding out the correct position to insert
                  while (prev >= 0 && arr[prev] > curr) {
                    arr[prev + 1] = arr[prev];
                    prev--;
                    }
                    arr[prev + 1] = curr;
                    }
                    }
                    }


        


// 1. make two parts one is sorted and another is sorted
// 2. In staring 1st part is single which will be sorted and then all other elements is in 2nd part which is unsorted.
// 3. Now we will take one by one element from 2nd part and insert it in 1st part in such a way that the element is inserted at correct position in 1st part so that 1st part remains sorted.
