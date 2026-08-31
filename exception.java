import java.util.Scanner;

public class exception{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Ist no - ");
        int a = sc.nextInt();

        System.out.println("Enter 2nd no - ");
        int b = sc.nextInt();

        int arr[] = {a,b};

        try {
            int c = a/b;
            String s = null;
            int index = 5;
            System.out.print(c);
            System.out.print(s.length());
            System.out.print(arr[index]);
        } 
        catch (ArithmeticException e) {
            System.out.print("Error ( ArithmeticException )");
        }
        catch (NullPointerException e) {
            System.out.print("Error ( NullPointerException )");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("Error ( ArrayIndexOutOfBoundsException )");
        }

        sc.close();
    }
}