import java.util.ArrayList;
import java.util.function.Predicate;

public class predicate {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(13);
        numbers.add(92);
        numbers.add(33); 
        numbers.add(54);
        numbers.add(95);

        // to print > 50

        System.out.println("Numbers greater than 50:");

        Predicate<Integer> greaterThan50 = n -> n > 50;
        
        for(Integer number : numbers){
            if(greaterThan50.test(number)){
                System.out.println(number);
            }
        }

        // to print even numbers

        System.out.println("\nEven numbers:");

        Predicate<Integer> isEven = n -> n%2 == 0;

        for(Integer number : numbers){
            if(isEven.test(number)){
                System.out.println(number);
            }
        }
    }

}
