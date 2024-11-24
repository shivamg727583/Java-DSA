public class Class_Object{
    public static void main(String[] args) {
        // Create an object of the class
        Pen p1 = new Pen();
        p1.setColor("Red");
        p1.setPrice(10);
        System.out.println(p1.color);
        System.out.println(p1.price);
    }
}

class Pen{
    String color;
    int price;

    void setColor(String colorName){
        color = colorName;
    }
    void setPrice(int rate){
        price = rate;
    }


}