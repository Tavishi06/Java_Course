import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hashmap {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Map<Integer, String> students = new HashMap<>();

        System.out.println("Enter no. of students :");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){

            System.out.print("Enter student id of student " + (i + 1) + " :");
            int id = sc.nextInt();

            System.out.print("Enter student name of student " + (i + 1) + " :");
            String name = sc.next();

            students.put(id, name);

        }

        // to find student name by id

        for (Map.Entry<Integer, String> entry : students.entrySet()) {

            System.out.println(entry.getKey() + " -> " + entry.getValue());
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
    }
}
