import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {

    String name;
    int age;
    double cgpa;

    Student(String name, int age, double cgpa) {
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
    }

    void display() {
        System.out.println(name + " - " + age + " - " + cgpa);
    }
}

public class ComparatorExample {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Rahul", 21, 8.2));
        students.add(new Student("Aman", 19, 9.1));
        students.add(new Student("Tavishi", 20, 8.9));

        // Sort by age
        Comparator<Student> ageComparator =
                (s1, s2) -> s1.age - s2.age;

        Collections.sort(students, ageComparator);

        System.out.println("Sorted by age:");

        for (Student s : students) {
            s.display();
        }

        // Sort by CGPA
        Comparator<Student> cgpaComparator =
                (s1, s2) -> Double.compare(s1.cgpa, s2.cgpa);

        Collections.sort(students, cgpaComparator);

        System.out.println("\nSorted by CGPA:");

        for (Student s : students) {
            s.display();
        }

        // Sort by name
        Comparator<Student> nameComparator =
                (s1, s2) -> s1.name.compareTo(s2.name);

        Collections.sort(students, nameComparator);

        System.out.println("\nSorted by name:");

        for (Student s : students) {
            s.display();
        }
    }
}