import java.util.Scanner;

class Intro
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    System.out.println("What is your name ?");
    String name = sc.nextLine();

    System.out.println("What is your age ?");
    int age = sc.nextInt();

    System.out.println("What is name of your college ? ");
    String college = sc.next();

    System.out.println("You are " + name + " and you are " + age + " years old. You are studying in " + college + ".");

    System.out.println("Enter two nos to perform operations : ");
    System.out.println("Enter first no : ");

    int a = sc.nextInt();
    System.out.println("Enter second no : ");
    int b = sc.nextInt();
    int sum = a + b;
    int sub = a - b;
    int mul = a * b;
    int div = a / b;
    int rem = a % b;

    System.out.println("The sum of " + a + " and " + b + " is : " + sum);
    System.out.println("The difference of " + a + " and " + b + " is : " + sub);
    System.out.println("The multiplication of " + a + " and " + b + " is : " + mul);
    System.out.println("The division of " + a + " and " + b + " is : " + div);
    System.out.println("The remainder of " + a + " and " + b + " is : " + rem);

    sc.close();
  }
}
