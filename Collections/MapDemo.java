import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String , Integer> student = new HashMap<>();
        student.put("Shivam", 20);
        student.put("Ayush", 10);
        student.put("Rahul", 15);
        student.put("Ayush", 10);
        student.put("Sahu", 18);

         student.put("Shivam",19); // here if "shivam" key is alreay exists then it will over ride that key and value , so if we don't this so we use putIfAbsent() method
        student.putIfAbsent("Shivam", 19); // if "shivam" key is absent then it will put , otheriwse not add

      

        System.out.println(student);

        System.out.println( "Value of Shivam :  "+ student.get("Shivam"));
        System.out.println(" all values : "+ student.values());
        System.out.println(" All Keys : "+ student.keySet());

        

    }
}
