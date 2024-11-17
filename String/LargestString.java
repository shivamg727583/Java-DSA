public class LargestString {
    public static void main(String[] args) {
        String[] fruits = {"apple","mango","banana","pineapple","orange"};
        String largest = largestString(fruits);
        System.out.println("Largest String : "+largest);
            }
        
            public static String largestString(String[] fruits) {
               String largest = fruits[0];
               for (int i = 0; i < fruits.length; i++) {
                if (largest.compareToIgnoreCase(fruits[i])<0) {
                    largest = fruits[i];
               }
            }
            return largest;
}
}
