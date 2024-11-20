public class Ones_Complement {
    public static void main(String[] args) {
        int n = 5;
        int n1 = ~n;
        System.out.println(n1);
    
    }
}

// Binary One's Complement ( ~ ) :
// ~5 = ~101 = 010



// Output :


  // = Rules :
//  ~ 0 = 1
// ~ 1 = 0

// 5 ->    0 0 0 0 0 1 0 1
//         ^             ^  
//         MSB           LSB
//
// NOTE: if MSB is 0 then the number is +ve ,otherwise -ve.
//       if LSB is 0 then the number is even otherwise odd.


// ~5 ->   1 1 1 1 1 0 1 0


// MSB - MOST SIGNIFICANT BIG
// LSB - LEAST SIGNIFICANT BIT

// 1. Sabse pahle 5 ka One's complement nikalenge
// 2. Fir jo answer aayega uska 2's completement nikalenge, jaise ki
// -> Two steps of 2's complement : (i). 1's complement
//                                  (ii). then Add 1

// 2's complement of ~5 = ~(~5 + 1) = ~6 = To 6 aayega lekin 1's complement ka MSB 1 hai to -6 hoga

// Ex-
// 5 ->    0 0 0 0 0 1 0
//         ^             ^
//         MSB           LSB
// ~5 ->   1 1 1 1 1 0 1
// ~5 + 1 -> 1 1 1 1 1 0
//         0 0 0 0 0 1 1
// ~6 = 1 1 1 1 1 1 0




///  **    Positive number ka complement -ve hoga
/// **      Negative number ka complement +ve hoga
/// 

