import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

        // 1. Supplier providing a String
        Supplier<String> name = () -> "Tavishi";

        System.out.println("Name: " + name.get());


        // 2. Supplier providing an Integer
        Supplier<Integer> number = () -> 100;

        System.out.println("Number: " + number.get());


        // 3. Supplier providing a calculated value
        Supplier<Integer> square = () -> 10 * 10;

        System.out.println("Square: " + square.get());


        // 4. Supplier generating random numbers
        Supplier<Double> randomNumber = () -> Math.random();

        System.out.println("Random number 1: " + randomNumber.get());
        System.out.println("Random number 2: " + randomNumber.get());


        // 5. Supplier providing the current time
        Supplier<Long> currentTime =
                () -> System.currentTimeMillis();

        System.out.println("Current time: " + currentTime.get());


        // 6. Practical example: generating a student ID
        Supplier<Integer> studentId =
                () -> (int) (Math.random() * 9000) + 1000;

        System.out.println("Student ID: " + studentId.get());


        // 7. Supplier with a message
        Supplier<String> message =
                () -> "Welcome to Java 8";

        System.out.println(message.get());
    }
}
