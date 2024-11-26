public class MethodOverloading {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();
    }
}

///  parent and child classes both contain the same function with a different definition.

class Animal{
    void eat(){ 
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{
    void eat(){
        System.out.println("Dog is eating");
        }
    }