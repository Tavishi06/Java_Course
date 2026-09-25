import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import java.util.Scanner;

public class hashmap {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Map<Integer, String> students = new HashMap<>();
        Map<Integer, String> students2 = new LinkedHashMap<>();
        Map<Integer, String> students3 = new TreeMap<>();

        System.out.println("Enter no. of students :");
        int n = sc.nextInt();

        // to add student id and name in hashmap

        for(int i = 0; i < n; i++){

            System.out.print("Enter student id of student " + (i + 1) + " :");
            int id = sc.nextInt();

            System.out.print("Enter student name of student " + (i + 1) + " :");
            String name = sc.next();

            students.put(id, name);
            students2.put(id, name);
            students3.put(id, name);

        }

        // to add student id and name in hashmap

        System.out.println("Student id and name in hashmap :");

          for (Map.Entry<Integer, String> entry : students.entrySet()) {

            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        // to add student id and name in linkedhashmap

        System.out.println("Student id and name in linkedhashmap :");

          for (Map.Entry<Integer, String> entry : students2.entrySet()) {

            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        
        // to add student id and name in treemap

        System.out.println("Student id and name in treemap :");

          for (Map.Entry<Integer, String> entry : students3.entrySet()) {

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
