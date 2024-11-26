public class PolymorphismDemo {

    // Compile-time polymorphism -(method overloading)
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println("Sum of 10 and 20 : "+cal.add(10, 20));
      System.out.println("SUm of 5.5 and 4.5 is : "+  cal.add((float)5.5, (float)4.5));
    System.out.println("Sum of 10,20 and 30 is : "+cal.add(10, 20,30));
    System.out.println("SUm of 5.5, 6.5 and 4.5 is : "+  cal.add((float)5.5, (float)4.5,(float)6.5));

    }
}


class Calculator{
    int add(int a,int b){
        return a+b;
    }
    float add(float a,float b){
        return a+b;
    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    float add(float a,float b,float c){
        return a+b+c;
    }

}
