import java.util.ArrayList;
import java.util.List;

class Box<T> {

    private T value;

    Box(T value) {
        this.value = value;
    }

    void display() {
        System.out.println("Box value: " + value);
    }

    T getValue() {
        return value;
    }
}


// Generic class with two types
class Pair<K, V> {

    private K key;
    private V value;

    Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    void display() {
        System.out.println("Key: " + key);
        System.out.println("Value: " + value);
    }
}


// Generic interface
interface Container<T> {

    void set(T value);

    T get();
}


// Implementing generic interface
class NumberContainer implements Container<Integer> {

    private Integer value;

    public void set(Integer value) {
        this.value = value;
    }

    public Integer get() {
        return value;
    }
}


public class GenericsExample {

    // Generic method
    public static <T> void display(T value) {
        System.out.println("Generic method: " + value);
    }


    // Bounded generic method
    public static <T extends Number> void printNumber(T value) {
        System.out.println("Number: " + value);
    }


    // Wildcard method
    public static void printList(List<?> list) {

        for (Object value : list) {
            System.out.println(value);
        }
    }


    // Upper-bounded wildcard
    public static void printNumbers(List<? extends Number> list) {

        for (Number value : list) {
            System.out.println(value);
        }
    }


    // Lower-bounded wildcard
    public static void addNumbers(List<? super Integer> list) {

        list.add(10);
        list.add(20);
        list.add(30);
    }


    public static void main(String[] args) {

        // 1. Generic class
        Box<Integer> b1 = new Box<>(100);
        Box<String> b2 = new Box<>("Hello");

        b1.display();
        b2.display();


        // 2. Generic class with two types
        Pair<String, Integer> student =
                new Pair<>("Tavishi", 89);

        student.display();


        // 3. Generic method
        display(100);
        display("Java");
        display(10.5);


        // 4. Bounded generic method
        printNumber(50);
        printNumber(25.5);


        // 5. Generic interface
        NumberContainer container = new NumberContainer();

        container.set(500);

        System.out.println(
                "Container value: " + container.get()
        );


        // 6. Wildcard
        ArrayList<String> names = new ArrayList<>();

        names.add("Tavishi");
        names.add("Rahul");
        names.add("Aman");

        System.out.println("\nWildcard list:");
        printList(names);


        // 7. Upper-bounded wildcard
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("\nNumbers:");
        printNumbers(numbers);


        // 8. Lower-bounded wildcard
        ArrayList<Number> numberList = new ArrayList<>();

        addNumbers(numberList);

        System.out.println("\nAfter adding integers:");
        System.out.println(numberList);
    }
}