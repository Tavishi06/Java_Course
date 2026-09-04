package college;

public class Student {

    private int marks;
    int age;
    protected String name;
    public String collegeName;

    // Constructor
    public Student(int marks, int age, String name, String collegeName) {
        this.marks = marks;
        this.age = age;
        this.name = name;
        this.collegeName = collegeName;
    }

    // Public method to access private variable
    public void displayMarks() {
        System.out.println("Marks: " + marks);
    }

    // Public method to display all details
    public void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("College: " + collegeName);
        System.out.println("Marks: " + marks);
    }
}