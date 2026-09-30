import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Deque;

public class dequeue {
    public static void main(String[] args){

        Deque<Integer> deque = new ArrayDeque<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of elements to add to Deque - ");
        int n = sc.nextInt();

        System.out.print("Enter elements : ");

        for(int i=0; i<n; i++){
            deque.add(sc.nextInt());
        }

        System.out.print("Deque = " + deque);

        System.out.print("enter element for addFirst() - ");
        int a = sc.nextInt();
        deque.addFirst(a);
        System.out.print(deque + "\n");

        System.out.print("enter element for addLast() - ");
        int b = sc.nextInt();
        deque.addLast(b);
        System.out.print(deque + "\n");

        System.out.print(" removeFirst() - ");
        deque.removeFirst();
        System.out.print(deque + "\n");

        System.out.print(" removeLast() - ");
        deque.removeLast();
        System.out.print(deque + "\n");

        System.out.print(" pollFirst() - ");
        deque.pollFirst();
        System.out.print(deque + "\n");

        System.out.print(" pollLast() - ");
        deque.pollLast();
        System.out.print(deque + "\n");

        System.out.print(" peekFirst() - ");
        System.out.print(deque.peekFirst() + "\n");

        System.out.print(" peekLast() - ");
        System.out.print(deque.peekLast() + "\n");
    }
}
