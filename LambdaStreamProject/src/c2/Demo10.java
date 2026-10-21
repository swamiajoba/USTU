package c2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Demo10 {

    public static void main(String[] args) {

        // Create a list of employees
        List<Employee> emplist = new ArrayList<>();

        emplist.add(new Employee(103, "Rahul", 60000.00));
        emplist.add(new Employee(101, "Amit", 45000.00));
        emplist.add(new Employee(105, "Priya", 75000.00));
        emplist.add(new Employee(102, "Neha", 50000.00));
        emplist.add(new Employee(104, "Kiran", 40000.00));

        // Comparator to sort employees by name
        Comparator<Employee> nameComp =
                (e1, e2) -> e1.getName().compareTo(e2.getName());

        System.out.println("\n===================");
        System.out.println("Print employees sorted by name");

        // Create a stream from the employee list
        Stream<Employee> empstream = emplist.stream();

        // Sort the stream using Comparator
        Stream<Employee> newempstream = empstream.sorted(nameComp);

        // Print sorted employees
        newempstream.forEach(System.out::println);

        System.out.println("\n===================");
        System.out.println("Sort employees directly using stream");

        // Create and sort a new stream
        emplist.stream()
               .sorted(nameComp)
               .forEach(System.out::println);

    }
}