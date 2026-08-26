import java.util.Scanner;

class person {

  String name;
  int roll_no;

  person(String name, int roll_no) {

    this.name = name;
    this.roll_no = roll_no;
  }

  public void display() {

    System.out.println("Name - " + name);
    System.out.println("Roll no - " + roll_no);
  }
}

class student extends person {

  int age;

  student(String name, int roll_no, int age) {

    super(name, roll_no);
    this.age = age;
  }

  public void display() {

    super.display();
    System.out.println("Age - " + age);
  }
}

class person2 {

  String name = "Parent";

  public void display() {
    System.out.print("Parent display( )");
  }

}

class student2 extends person2 {

  String name = "Child";

  public void display() {
    System.out.print("Child display( )");
  }

  public void toprint(){

    System.out.println(this.name);
    System.out.println(super.name);

    this.display();
    super.display();
  }
}

public class inheritence {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your name - ");
    String name = sc.nextLine();

    System.out.println("Enter your roll no - ");
    int roll_no = sc.nextInt();

    System.out.println("Enter your age - ");
    int age = sc.nextInt();

    student s = new student(name, roll_no, age);
    s.display();

    student2 s2 = new student2();
    s2.toprint();

    sc.close();
  }
}
