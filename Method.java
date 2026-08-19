import java.util.Scanner;

public class Method {

  static int square(int x) 
  {
    return x * x;
  }

  static int max(int a, int b) 
  {
    if (a > b) {
      return a;
    } else {
      return b;
    }
  }

  static boolean isEven(int num)
  {
    return num % 2 == 0;
  }

  static int factorial(int n)
  {
    int fact = 1;
    for (int i = 1; i <= n; i++) {
      fact *= i;
    }
    return fact;
  }

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter any number = ");
    int num = sc.nextInt();

    int result = square(num);
    System.out.println("Square of "+num+" is "+result);

    System.out.print("Enter two numbers = ");
    int a = sc.nextInt();
    int b = sc.nextInt();

    int maxResult = max(a, b);
    System.out.println("Out of "+a+" and "+b+" the Maximum number is "+maxResult);

    boolean isEvenResult = isEven(num);
    System.out.println(num+" is " +(isEvenResult ? "even" : "odd"));

    int factorialResult = factorial(num);
    System.out.println("Factorial of "+num+" is "+factorialResult);

    sc.close();
  }
}
