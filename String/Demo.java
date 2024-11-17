public class Demo {
    public static void main(String[] args) {
        String str = "Shivam";
        String str1 = "Shivam";
        String str2 = new String("Shivam");
        System.out.println(str==str1); // locating same object
        System.out.println(str==str2); // str2 is another object and str & str2 is other object
        System.out.println(str1==str2);

    }
}
