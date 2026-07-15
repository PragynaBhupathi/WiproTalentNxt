import java.util.ArrayList;

public class HOA4 {

    public static void main(String[] args) {

        ArrayList<Number> numbers = new ArrayList<>();

        numbers.add(10);       
        numbers.add(25.5);      
        numbers.add(15.7f);     
        numbers.add(100L);      

        System.out.println("Numbers in ArrayList:");

        for(Number n : numbers) {
            System.out.println(n);
        }
    }
}