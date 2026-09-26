
import java.util.PriorityQueue;
import java.util.Collections;

public class queue {

    public static void main(String[] args) {

        // ==========================================
        // MIN PRIORITY QUEUE
        // Smallest element has highest priority
        // ==========================================

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // 1. add()
        pq.add(30);
        pq.add(10);
        pq.add(20);

        System.out.println("PriorityQueue after add(): " + pq);

        // 2. offer()
        pq.offer(40);

        System.out.println("PriorityQueue after offer(): " + pq);

        // 3. peek()
        System.out.println("Highest priority using peek(): " + pq.peek());

        // 4. element()
        System.out.println("Highest priority using element(): " + pq.element());

        // 5. contains()
        System.out.println("Does PriorityQueue contain 20? "
                + pq.contains(20));

        // 6. size()
        System.out.println("PriorityQueue size: " + pq.size());

        // 7. poll()
        System.out.println("Removed using poll(): " + pq.poll());

        System.out.println("PriorityQueue after poll(): " + pq);

        // 8. remove()
        System.out.println("Removed using remove(): " + pq.remove());

        System.out.println("PriorityQueue after remove(): " + pq);

        // 9. isEmpty()
        System.out.println("Is PriorityQueue empty? "
                + pq.isEmpty());

        // 10. clear()
        pq.clear();

        System.out.println("PriorityQueue after clear(): " + pq);

        System.out.println("Is PriorityQueue empty now? "
                + pq.isEmpty());


        // ==========================================
        // EMPTY PRIORITY QUEUE BEHAVIOR
        // ==========================================

        System.out.println("\n--- Empty PriorityQueue Tests ---");

        // peek() on empty PriorityQueue
        System.out.println("peek(): " + pq.peek());

        // poll() on empty PriorityQueue
        System.out.println("poll(): " + pq.poll());

        // contains() on empty PriorityQueue
        System.out.println("contains(10): " + pq.contains(10));

        // size() on empty PriorityQueue
        System.out.println("size(): " + pq.size());

        // isEmpty() on empty PriorityQueue
        System.out.println("isEmpty(): " + pq.isEmpty());


        // element() on empty PriorityQueue
        try {
            System.out.println("element(): " + pq.element());
        } catch (Exception e) {
            System.out.println("element(): Exception - "
                    + e.getClass().getSimpleName());
        }


        // remove() on empty PriorityQueue
        try {
            System.out.println("remove(): " + pq.remove());
        } catch (Exception e) {
            System.out.println("remove(): Exception - "
                    + e.getClass().getSimpleName());
        }


        // ==========================================
        // MAX PRIORITY QUEUE
        // Largest element has highest priority
        // ==========================================

        PriorityQueue<Integer> maxPQ =
                new PriorityQueue<>(Collections.reverseOrder());

        maxPQ.add(10);
        maxPQ.add(50);
        maxPQ.add(30);
        maxPQ.add(20);
        maxPQ.add(40);

        System.out.println("\n--- Max PriorityQueue ---");

        System.out.println("Max PriorityQueue: " + maxPQ);

        System.out.println("Highest priority: " + maxPQ.peek());

        System.out.println("Removing elements by priority:");

        while (!maxPQ.isEmpty()) {
            System.out.println(maxPQ.poll());
        }
    }
}