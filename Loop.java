import java.util.Scanner;

public class Loop 
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number between 1 and 100 = ");
    int num = sc.nextInt();

    int x = num;

    int sum = 0;
    int rem = 0;
    int count = 0;
    int rev = 0;
    int a = 0;
    
    while (num != 0)
   {
     rem = num%10;  
     sum = sum + rem;
     num = num/10;

     count++;

     rev = rev*10 + rem;

    }

    System.out.println("Number of digits in "+x+" is "+count);
    System.out.println("Sum of digits of "+x+" is "+sum);

    if (x == rev) {
      System.out.println(x + " is a palindrome number");
    } else {
      System.out.println(x + " is not a palindrome number");
    }

    for( int i = 1; i <= 10; i++)
    {
      if(x % i == 0 && x != i && i != 1)
      {
        System.out.println(x + " is not a prime number ");
        a++;
        break;
      }
    }

    if (a == 0) {
      System.out.println(x + " is a prime number ");
    }

    sc.close();
  } 
}
