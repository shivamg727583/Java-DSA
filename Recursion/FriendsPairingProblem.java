public class FriendsPairingProblem {
    public static void main(String[] args) {
        int n = 3;
        System.out.println("No. of ways is : "+PairedFriends(n));

        
    }
    public static int PairedFriends(int n){
    if(n==1 || n==2){
        return n;
    }
    // single choice
    int way1 = PairedFriends(n-1);
    
    // pair choice
    int way2 = (n-1)*PairedFriends(n-2);
    return way1+way2;

    


    }
}

// Friends Pairing Problem
// Given n friends , each one can remain single or can be paired up with some other friend.Each friend can be paired only once . Find out the total number of ways in which friends can remain single or can be paired up.