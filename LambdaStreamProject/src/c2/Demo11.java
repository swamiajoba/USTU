
package c2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Demo11 {

    public static void main(String[] args) {

        // Create a list of employees
        List<Employee> emplist = new ArrayList<>();

        emplist.add(new Employee(103, "Rahul", 60000.00));
        emplist.add(new Employee(101, "Amit", 45000.00));
        emplist.add(new Employee(105, "Priya", 75000.00));
        emplist.add(new Employee(102, "Neha", 50000.00));
        emplist.add(new Employee(104, "Kiran", 40000.00));

        // Choose sorting criteria: "name" or "salary"
        String meth = "salary";

        System.out.println("\n===================");
        System.out.println("Employees sorted by " + meth);

        Stream<Employee> empstream = emplist.stream();

        Stream<Employee> newempstream = empstream.sorted(
            (e1, e2) -> meth.equals("name")
                    ? e1.getName().compareTo(e2.getName())
                    : Double.compare(e1.getSalary(), e2.getSalary())
        );

        newempstream.forEach(System.out::println);

        System.out.println("\n===================");
        System.out.println("Find minimum salary employee");

        Stream<Employee> empstream1 = emplist.stream();

        Optional<Employee> minSalaryEmployee =
                empstream1.min(
                    Comparator.comparingDouble(Employee::getSalary)
                );

        minSalaryEmployee.ifPresent(System.out::println);

        System.out.println("\n===================");
        System.out.println("Find maximum salary employee");

        Stream<Employee> empstream2 = emplist.stream();

        Optional<Employee> maxSalaryEmployee =
                empstream2.max(
                    Comparator.comparingDouble(Employee::getSalary)
                );

        maxSalaryEmployee.ifPresent(System.out::println);
    }
}
