import java.util.ArrayList;
import java.util.Scanner;

public class arraylist2 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

         ArrayList<Integer> numbers = new ArrayList<>();

         for(int i=0; i<5; i++){
             System.out.print("Enter no " + (i+1) + ": ");
             int num = sc.nextInt();
             numbers.add(num);
         }

        System.out.println("The numbers you entered are: " + numbers);
    }
}
