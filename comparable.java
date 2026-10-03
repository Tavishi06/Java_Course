import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{


    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override 
    public int compareTo(Student s){
        return this.age - s.age;
    }

    void display(){
        
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public class Comparable{
        
        public static void main(String[] args) {
            ArrayList<Student> students = new ArrayList<>();

            students.add(new Student("Alice", 22));
            students.add(new Student("Bob", 20));
            students.add(new Student("Charlie", 21));

            for(Student s : students){
                s.display();
            }

            Collections.sort(students);

            System.out.println("After sorting by age:");
            for(Student s : students){
                s.display();
            }
        }
    }
}