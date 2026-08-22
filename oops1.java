import java.util.Scanner;

public class oops1 {

  public class student
  {
    String name;
    int age;
    int roll_no;

    // Constructor for Student
    public student(String name, int age, int roll_no) 
    {
    this.name = name;
    this.age = age;
    this.roll_no = roll_no;
    }

    public void display() {

      System.out.println("Name: " + name);
      System.out.println("Age: " + age);
      System.out.println("Roll No: " + roll_no);

    }
  }
  
  public class rectangle
  {
    
    int length;
    int breath;
    int area;
    int parameter;

    // Constructor for Rectangle
    public rectangle(int length, int breath) {
    this.length = length;
    this.breath = breath;

    this.area = length * breath;
    this.parameter = 2 * (length + breath);
    }
    
    public void display() {
      System.out.println("Area: " + area);
      System.out.println("Perimeter: " + parameter);

    }

  }

  public class product
  {
    private double price;

    public void setprice(double price) {
      this.price = price;

      if(price < 0) {
        System.out.println("Price cannot be negative. Setting price to 0.");
        this.price = 0;
      }
      else {
        this.price = price;
      }
    }

    public void display() {
      System.out.println("Price: " + price);
    }

  }

  public class nos
  {
    private int num;

    public void setnum(int num) {
      this.num = num;

      if(num >= 0 && num <= 100) {
        System.out.println("Number is valid.");
        this.num = num;
      }
      else {
        System.out.println("Number is invalid. Setting number to 0.");
        this.num = 0;
      }
    }

    public void display() {
      System.out.println("Number : " + num);

    }

  }

  public class bank
  {
    private double balance;

    public void setbalance(double balance) {
      this.balance = balance;

      if(balance < 0) {
        System.out.println("Balance cannot be negative. Setting balance to 0.");
        this.balance = 0;
      }
      else {
        this.balance = balance;
      }
    }

    public void displaybefore() {
      System.out.println("Balance before withdrawal: " + balance);

    }

      public void withdraw(double amount) {
        if(amount > balance) {
          System.out.println("Insufficient balance. Withdrawal failed.");
        }
        else {
          balance -= amount;
          System.out.println("Withdrawal successful. New balance: " + balance);
        }

        System.out.println("Balance after withdrawal of " + amount + ": " + balance);

      }

    } 
   
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Student input

    System.out.println("\n");
    System.out.println("\n Enter Student Details \n");
    
    System.out.print("Enter student name: ");
    String name = sc.nextLine();

    System.out.print("Enter student age: ");
    int age = sc.nextInt();

    System.out.print("Enter student roll no: ");
    int roll_no = sc.nextInt();

    System.out.println("\n");
    System.out.println("\n Enter Rectangle Details \n");

    oops1 obj = new oops1();

    oops1.student student = obj.new student(name, age, roll_no);

    // Rectangle input

    System.out.print("Enter length: ");
    int length = sc.nextInt();

    System.out.print("Enter breadth: ");
    int breadth = sc.nextInt();

    oops1.rectangle rectangle = obj.new rectangle(length, breadth);

    System.out.println("\n Student Details ");
    student.display();

    System.out.println("\n Rectangle Details ");
    rectangle.display();

    // Product input

    System.out.println("\n");
    System.out.println("\n Enter Product Details \n");
    System.out.print("Enter product price: ");
    double price = sc.nextDouble();

    oops1.product product = obj.new product();
    product.setprice(price);

    // Number input

    System.out.println("\n");
    System.out.println("\n Enter Number Details \n");
    System.out.print("Enter a number: ");
    int num = sc.nextInt();

    oops1.nos nos = obj.new nos();
    nos.setnum(num);

    // Bank input

    System.out.println("\n");
    System.out.println("\n Enter Bank Details \n");
    System.out.print("Enter initial balance: ");
    double balance = sc.nextDouble();

    System.out.print("Enter withdrawal amount: ");
    double amt = sc.nextDouble();

    oops1.bank bank = obj.new bank();
    bank.setbalance(balance);
    bank.withdraw(amt); // Example withdrawal amount

    sc.close();
  }
}