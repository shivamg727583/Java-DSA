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
           ^             ^  
//         MSB           LSB
//
// NOTE: if MSB is 0 then the number is +ve ,otherwise -ve.
//       if LSB is 0 then the number is even otherwise odd.


// ~5 ->   1 1 1 1 1 0 1


// MSB - MOST SIGNIFICANT BIG
// LSB - LEAST SIGNIFICANT BIT
