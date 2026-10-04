import java.util.ArrayList;
import java.util.function.Consumer;

public class consumer {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(13);
        numbers.add(92);
        numbers.add(33);
        numbers.add(54);
        numbers.add(95);

        System.out.println("Numbers in the list:");
        
        Consumer<Integer> printNumber = n -> System.out.println(n);
        
        for (Integer number : numbers) {
            printNumber.accept(number);
        }

        // for square of numbers

        System.out.println("\nSquare of numbers:");

        Consumer<Integer> first = n -> System.out.println("Number: " + n);

        Consumer<Integer> second = n -> System.out.println("Square: " + (n * n));

        Consumer<Integer> both = first.andThen(second);

        both.accept(5);
    }
}
