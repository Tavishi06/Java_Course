
import java.util.Queue;
import java.util.LinkedList;

public class queue {

    public static void main(String[] args) {

        // Creating Queue
        Queue<Integer> queue = new LinkedList<>();

        // 1. add()
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Queue after add(): " + queue);

        // 2. offer()
        queue.offer(40);

        System.out.println("Queue after offer(): " + queue);

        // 3. peek()
        System.out.println("Front element using peek(): " + queue.peek());

        // 4. element()
        System.out.println("Front element using element(): " + queue.element());

        // 5. contains()
        System.out.println("Does queue contain 20? " + queue.contains(20));

        // 6. size()
        System.out.println("Queue size: " + queue.size());

        // 7. poll()
        System.out.println("Removed using poll(): " + queue.poll());

        System.out.println("Queue after poll(): " + queue);

        // 8. remove()
        System.out.println("Removed using remove(): " + queue.remove());

        System.out.println("Queue after remove(): " + queue);

        // 9. isEmpty()
        System.out.println("Is queue empty? " + queue.isEmpty());

        // 10. clear()
        queue.clear();

        System.out.println("Queue after clear(): " + queue);

        // Checking again
        System.out.println("Is queue empty now? " + queue.isEmpty());
        
        
        /**  EMPTY QUEUE BEHAVIOR TESTS  **/
        
        System.out.println("\n--- Empty Queue Tests ---");
        
        // peek() on empty queue
        System.out.println("peek(): " + queue.peek());

        // poll() on empty queue
        System.out.println("poll(): " + queue.poll());

        // contains() on empty queue
        System.out.println("contains(10): " + queue.contains(10));

        // size() on empty queue
        System.out.println("size(): " + queue.size());

        // isEmpty() on empty queue
        System.out.println("isEmpty(): " + queue.isEmpty());


        // element() on empty queue
        try {
            System.out.println("element(): " + queue.element());
        } 
        catch (Exception e) {
            System.out.println("element(): Exception - "
            + e.getClass().getSimpleName());
        }


        // remove() on empty queue
        try {
        System.out.println("remove(): " + queue.remove());
        }
        catch (Exception e) {
            System.out.println("remove(): Exception - "
            + e.getClass().getSimpleName());
        }
    }
}