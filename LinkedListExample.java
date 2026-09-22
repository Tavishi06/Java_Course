import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args){

        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

         System.out.println("The numbers in the LinkedList are: " + numbers);

        // to add at beginning
        numbers.addFirst(0);

        // to add at end
        numbers.addLast(40);

         System.out.println("The numbers in the LinkedList after insertion are: " + numbers);

        // to remove first element
        numbers.removeFirst();

        // to remove last element
        numbers.removeLast();

        System.out.println("The numbers in the LinkedList after removal are: " + numbers);

        // to get the any element
        numbers.get(2);
    }
}
