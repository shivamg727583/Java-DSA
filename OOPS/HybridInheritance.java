public class HybridInheritance {
    public static void main(String[] args) {
        // Create an object of the subclass
       
        Dog d=new Dog();
        d.eat();
        d.walk();
        d.animalType();
        System.out.println();

        Cat c=new Cat();
        c.eat();
        c.walk();
        c.animalType();
        System.out.println();

        Parrot p=new Parrot();
        p.eat();
        p.fly();
        p.birdType();
        System.out.println();

        Shark s=new Shark();
        s.eat();
        s.swim();
        s.Fishtype();;
        System.out.println();

        Tuna t=new Tuna();
        t.eat();
        t.swim();
        t.Fishtype();
        System.out.println();


    }
}

// Parent
class Animal{
    void eat() {
        System.out.println("Animals are eating");
        }
}

class Fish extends Animal{
    void swim() {
        System.out.println("Fish are swimming");
        }
}
class Shark extends Fish {
    void Fishtype(){
        System.out.println("Shark is a fish");
    }
}
class Tuna extends Fish {
    void Fishtype(){
        System.out.println("Tuna is a fish");
    }
}

class Bird extends Animal{
    void fly() {
        System.out.println("Birds are flying");
    }
}

class Parrot extends Bird{
    void birdType(){
        System.out.println("Parrot is a bird");
    }
}

class Mammal extends Animal{
    void walk() {
        System.out.println("Mammals are walking");
        }
}

class Dog extends Mammal{
    void animalType(){
        System.out.println("Dog is a mammal");
    }
}
class Cat extends Mammal{
    void animalType(){
        System.out.println("Cat is a mammal");
        }
}