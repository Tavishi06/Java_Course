import java.util.ArrayList;
import java.util.Scanner;

public class arraylist2 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

         ArrayList<Integer> numbers = new ArrayList<>();

         // Taking input from user and adding to the ArrayList

         for(int i=0; i<5; i++){
             System.out.print("Enter no " + (i+1) + ": ");
             int num = sc.nextInt();
             numbers.add(num);
         }

        System.out.println("The numbers you entered are: " + numbers);

        // Calculating the sum of the numbers in the ArrayList

        int sum = 0;
        
        for (Integer number : numbers) {
            sum += number;
        }
        
        System.out.println("Sum = " + sum);

        // Finding the maximum number in the ArrayList

        int max = numbers.get(0);
        
        for (Integer number : numbers) {
            
            if (number > max) {
            max = number;
            }
        }
        
        System.out.println("Maximum = " + max);

        // Removing elements from the ArrayList by two methods: by index and by value

        numbers.remove(1);                                    // by index
        numbers.remove(Integer.valueOf(30));                      // by value
        System.out.println("Numbers after removal: " + numbers);
    }
}
