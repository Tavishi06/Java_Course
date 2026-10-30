import java.util.ArrayList;

public class stream {
    public static void main(String[] args){

        ArrayList<Integer> num = new ArrayList<>();
        
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(43);
        num.add(50);

        // printing all the elements of the arraylist
        
        System.out.println("Elements of the arraylist are: ");

        num.stream()
        .forEach((n) -> System.out.println(n));

        // print nos greater than 20

        System.out.println("Numbers greater than 20 are: ");

        num.stream()
        .filter(n -> n > 20)
        .forEach((n) -> System.out.println(n));

        // even odd nos

        System.out.println("Odd numbers are: ");

        num.stream()
        .filter(n -> n % 2 != 0)
        .forEach(n -> System.out.println(n));
    }
}
