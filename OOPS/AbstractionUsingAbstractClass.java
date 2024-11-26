public class AbstractionUsingAbstractClass {
    public static void main(String[] args) {
        Horse h=new Horse();
        h.eat();
        h.walk();
System.out.println(h.color);
        
    Cat c=new Cat();
    c.eat();
    c.walk();
    }

    
        
    

}

abstract class Animal{
    String color;
    Animal(){
        color = "red";
    }
    void eat(){
        System.out.println("Animal Eating");
    }

    abstract void walk();
}

class Horse extends Animal{
    void walk(){
        System.out.println("Horse is Walking");
        }
}

class Cat extends Animal{
void walk(){

    System.out.println("Cat is Walking");
}
}