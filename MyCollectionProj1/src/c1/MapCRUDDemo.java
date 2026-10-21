package c1;


import java.util.HashMap;
import java.util.Map;

public class MapCRUDDemo {
    public static void main(String[] args) {

        // CREATE: Create a map
        Map<Integer, String> students = new HashMap<>();

        students.put(101, "Amit");
        students.put(102, "Priya");
        students.put(103, "Rahul");

        System.out.println("After Create: " + students);

        // READ: Get a student's name using the key
        System.out.println("\nStudent with ID 102: "
                + students.get(102));

        // Read all key-value pairs
        System.out.println("\nReading all students:");
        for (Map.Entry<Integer, String> entry  : students.entrySet()) {

            System.out.println(
                    "ID: " + entry.getKey()
                    + ", Name: " + entry.getValue()
            );
        }

        // UPDATE: Change the value for key 102
        students.put(102, "Sneha");
        System.out.println("\nAfter Update: " + students);

        // CREATE: Add another student
        students.put(104, "Neha");
        System.out.println("After adding ID 104: " + students);

        // DELETE: Remove student with key 101
        students.remove(101);
        System.out.println("After Delete: " + students);

        // Check whether a key exists
        System.out.println("Does ID 103 exist? "
                + students.containsKey(103));

        // Check whether a value exists
        System.out.println("Is Priya present? "
                + students.containsValue("Priya"));
    }
}
