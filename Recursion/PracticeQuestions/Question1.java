package PracticeQuestions;

// Ques-1 : For a given interger array of size N. You have to find all the occurences of a given element and print them . use recursive function to solve this problem.

// arr[] = {3,2,4,5,6,2,7,2,2}  , key =2
// output : 1 5 7 8  (indices)

public class Question1 {
    public static void main(String[] args) {
        int[] arr = {3,2,4,5,6,2,7,2,2};
        int key = 2;
        printAllOccurences(arr, key, 0);
            }
        
           public static void printAllOccurences(int[] arr, int key, int i) {
    if(i == arr.length){
        return;
    }
    if(arr[i] == key){
        System.out.print(i + " ");
    }

    printAllOccurences(arr, key, i+1);

}
    
}
