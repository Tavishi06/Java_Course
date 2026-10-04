import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Iteratoro {

    public static void main(String[] args) {

        // ==========================================
        // 1. ArrayList + Iterator
        // ==========================================

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("ArrayList = " + list);

        Iterator<Integer> it = list.iterator();

        System.out.println("\nTraversing ArrayList using Iterator:");

        while (it.hasNext()) {
            System.out.println(it.next());
        }


        // ==========================================
        // 2. HashSet + Iterator
        // ==========================================

        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20);   // Duplicate
        set.add(40);

        System.out.println("\nHashSet = " + set);

        Iterator<Integer> setIterator = set.iterator();

        System.out.println("\nTraversing HashSet using Iterator:");

        while (setIterator.hasNext()) {
            System.out.println(setIterator.next());
        }


        // ==========================================
        // 3. Iterator remove()
        // ==========================================

        ArrayList<Integer> removeList = new ArrayList<>();

        removeList.add(10);
        removeList.add(20);
        removeList.add(30);
        removeList.add(40);
        removeList.add(50);

        System.out.println("\nBefore remove = " + removeList);

        Iterator<Integer> removeIterator = removeList.iterator();

        while (removeIterator.hasNext()) {

            int value = removeIterator.next();

            if (value == 30) {
                removeIterator.remove();
            }
        }

        System.out.println("After removing 30 = " + removeList);


        // ==========================================
        // 4. Remove all numbers divisible by 10
        // ==========================================

        ArrayList<Integer> numberList = new ArrayList<>();

        numberList.add(10);
        numberList.add(15);
        numberList.add(20);
        numberList.add(25);
        numberList.add(30);
        numberList.add(35);
        numberList.add(40);

        System.out.println("\nBefore removing multiples of 10 = " + numberList);

        Iterator<Integer> numberIterator = numberList.iterator();

        while (numberIterator.hasNext()) {

            int value = numberIterator.next();

            if (value % 10 == 0) {
                numberIterator.remove();
            }
        }

        System.out.println("After removing multiples of 10 = " + numberList);


        // ==========================================
        // 5. Empty Iterator check
        // ==========================================

        ArrayList<Integer> emptyList = new ArrayList<>();

        Iterator<Integer> emptyIterator = emptyList.iterator();

        System.out.println("\nIs empty collection having next element? "
                + emptyIterator.hasNext());

        // Don't call emptyIterator.next() here.
        // There is no element, so next() would throw NoSuchElementException.
    }
}