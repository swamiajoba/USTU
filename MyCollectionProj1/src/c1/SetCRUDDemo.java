package c1;


import java.util.HashSet;
import java.util.Set;

public class SetCRUDDemo {
    public static void main(String[] args) {

        // CREATE: Create a set
        Set<String> students = new HashSet<>();

        students.add("Amit");
        students.add("Priya");
        students.add("Rahul");
        students.add("Priya"); // Duplicate is ignored

        System.out.println("After Create: " + students);

        // READ: Display all unique students
        System.out.println("\nReading students:");
        for (String student : students) {
            System.out.println(student);
        }

        // Check whether a student exists
        System.out.println("\nIs Priya present? "
                + students.contains("Priya"));

        // UPDATE: Set has no index-based update.
        // Remove the old value and add the new value.
        students.remove("Rahul");
        students.add("Sneha");

        System.out.println("\nAfter Update: " + students);

        // DELETE: Remove a student
        students.remove("Amit");
        System.out.println("After Delete: " + students);

        // Number of unique students
        System.out.println("Total students: " + students.size());
    }
}
