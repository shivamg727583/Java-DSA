public class Constructors {
    public static void main(String[] args) {
       Student s = new Student();
       Student s1 = new Student("Shivam");
       s1.display();
       Student s2 = new Student(s1);
       System.out.println(s2.name);
    }
}
 class Student {
String name;
int age;
Student(){
    System.out.println("Default Constructor");
}
Student(String name){
    this.name=name;
    System.out.println("Parameterized Constructor");
}

Student(Student other){
    this.name=other.name;
}

public void display(){
    System.out.println("Name is :"+name);
}
    
}