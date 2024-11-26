public class MultiLevelInheritance {
    public static void main(String[] args) {
       Dog a = new Dog();
       a.eat();
       a.walk();

    }
}

class Animal{
    
    void eat(){
        System.out.println("The Animal eats");
    }

}
class Mammal extends Animal{
    void walk(){
        System.out.println("The Mammal walks");
    }
}
class Dog extends Mammal{
    void bark(){
        System.out.println("The Dog barks");
    }
}