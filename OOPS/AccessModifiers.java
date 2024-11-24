public class AccessModifiers {
    public static void main(String[] args) {
        // Accessing public members
        

        BankAccount myAcc = new BankAccount();
        myAcc.username ="Shivam";
        myAcc.setPassword("shivam");

        System.out.println("Username name: "+myAcc.username);
        myAcc.getPassword();
    }
}

class BankAccount{
    public String username;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }
    public void getPassword(){
        System.out.println("password is :"+password);
    }

}