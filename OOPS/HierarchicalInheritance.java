public class HierarchicalInheritance {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.eat();
        d.bark();

        Cat c= new Cat();
        c.eat();
        c.meau();
    }
}

class Animal{
    void eat() {
        System.out.println("Eating");
    }

}

class Dog extends Animal{
    void bark() {
        System.out.println("Barking");
        }
}
class Cat extends Animal {
void meau(){
    System.out.println("Meauing");
}
    
}