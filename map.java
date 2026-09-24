import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class map {
    public static void main(String[] args){

        Map<Integer, String> students = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of students :");
        int n = sc.nextInt();

        System.out.println("Enter student details :");

        for(int i = 0; i < n; i++) 
        {
            System.out.println("Enter student id of student " + (i + 1) + " :");
            int id = sc.nextInt();

            System.out.println("Enter student name of student " + (i + 1) + " :");
            String name = sc.next();

            students.put(id, name);
        }

        // to find student name by id

        System.out.println("Enter student id to find name :");
        int findId = sc.nextInt();

        if(students.containsKey(findId)) 
        {
            System.out.println("Id is - " + findId + ", Student name is : " + students.get(findId));
        } 
        else 
        {
            System.out.println("Student id not found.");
        }

        // to remove student by id

        System.out.println("Enter student id to remove :");
        int removeId = sc.nextInt();

        if(students.containsKey(removeId)) 
        {
            students.remove(removeId);
            System.out.println("Student with id " + removeId + " is removed.");
        } 
        else 
        {
            System.out.println("Student id not found.");
        }

        sc.close();
    }
}
