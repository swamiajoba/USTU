package c1;

import java.util.ArrayList;
import java.util.List;

public class ListCRUDDemo {
    public static void main(String[] args) {

        // CREATE: Create a list and add students
        List<String> students = new ArrayList<>();

        students.add("Amit");
        students.add("Priya");
        students.add("Rahul");
        students.add("Priya"); // Duplicate is allowed

        System.out.println("After Create: " + students);

        // READ: Display all students
        System.out.println("\nReading all students:");
        for (String student : students) {
            System.out.println(student);
        }

        // Read one student using index
        System.out.println("Student at index 1: "
                + students.get(1));

        // UPDATE: Replace the student at index 2
        students.set(2, "Sneha");
        System.out.println("\nAfter Update: " + students);

        // DELETE: Remove student at index 0
        students.remove(0);
        System.out.println("After Delete: " + students);

        // Check whether a student exists
        System.out.println("Is Rahul present? "
                + students.contains("Rahul"));
        
        
        String searchName = "Priya";
        
        // SEARCH 2: Find the first index of a student
        int index = students.indexOf(searchName);

        if (index != -1) {
            System.out.println("First position: " + index);
        } else {
            System.out.println("Student not found");
        }
        
        
        // SEARCH 3: Find the last occurrence
        System.out.println(
                "Last position: " + students.lastIndexOf("Priya"));
        
        // SEARCH 4: Find all occurrences using a loop
        System.out.println("All matching positions:");

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).equals(searchName)) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}
