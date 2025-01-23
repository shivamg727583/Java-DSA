  
   package PracticeQuestions;

// Ques-2 : U are given a number( eg- 2019) ,convert it into string of english like "two zero one nine " . use recusrsive function to solve this problem.

// NOte: The digits of the number will only be in the range 0-9 and the last digit of a number can't be 0;

// sample input : 1947
// sample output : "one nine four seven"
public class Question2 {
    public static void main(String[] args) {
        numberToWords(1939920200);
    }

  public static void numberToWords(int n) {
    String Numbers[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
    if (n < 0) {
        System.out.print("negative ");
        numberToWords(-n);
        return;
    } else if (n == 0) {
        return;
    }
    if (n < 10) {
        System.out.print(Numbers[n] + " ");
    } else {
        numberToWords(n / 10);
        System.out.print(Numbers[n % 10] + " ");
    }
}

    }


