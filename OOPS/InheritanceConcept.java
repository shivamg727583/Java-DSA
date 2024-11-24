
 class Animal {
   void eat(){
    System.out.println("The animal eats food.");
   }
    
}

class Dog extends Animal{
    void bark(){
        System.out.println("The dog barks.");

    }
}

public class InheritanceConcept {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();   // Inherited method from Animal class
        d.bark();  // Method from Dog class
    }
}