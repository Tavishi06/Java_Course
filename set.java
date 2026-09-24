import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class set {
    public static void main(String[] args){

        Set<Integer> numbers = new HashSet<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of elements :");
        int n = sc.nextInt();

        System.out.println("Enter elements :");
        
        for (int i = 0; i < n; i++) 
        {
            numbers.add(sc.nextInt());
        }

        System.out.println(numbers);

        // To take one more input from user

        System.out.println("Enter one more element :");
        int newElement = sc.nextInt();

        System.out.println(newElement + " is added to the set.");

        // find any element 

        System.out.println("Enter an element to find :");
        int findElement = sc.nextInt();

        System.out.println("Is " + findElement + " present in the set ? " + numbers.contains(findElement));
        
        sc.close();
    }
}
