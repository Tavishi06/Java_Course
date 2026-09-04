package company;

import college.Student;

public class Main {

    public static void main(String[] args) {

        Student s = new Student(
            90,
            21,
            "Tavishi",
            "IKGPTU"
        );

        // Public variable → accessible
        System.out.println("College: " + s.collegeName);

        // Private variable → NOT directly accessible
        // System.out.println(s.marks);

        // Default variable → NOT accessible outside package
        // System.out.println(s.age);

        // Protected variable → NOT directly accessible
        // from a non-subclass in another package
        // System.out.println(s.name);

        // Private marks can be accessed
        // through a public method
        s.displayMarks();

        // Public method → accessible
        s.displayStudent();
    }
}