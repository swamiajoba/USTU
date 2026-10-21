package c2;

import java.util.*;
import java.util.stream.Stream;

class EmployeeStreamDemo {
	public static void main(String args[]) {
		List<Employee> el = new ArrayList<Employee>();
		// add elements to the ArrayList
		el.add(new Employee(100,"Ram",24000.00));
		el.add(new Employee(105,"Arjun",22000.00));
		el.add(new Employee(109,"Sham",28000.00));
		el.add(new Employee(104,"Krishna",27000.00));
		el.add(new Employee(102,"Ganesh",23000.00));
	
//		System.out.println("============>Employee who has salary > 25000.00");
//
//		for(Employee e:el)
//		{
//			if(e.getSalary()>25000.00)
//			{
//				System.out.println(e);
//			}
//		}
		
		System.out.println("============>Employee who has salary > 25000.00 using Strem API");
		// sequential stream means in stream one by one elements are processed
//		Stream<Employee> stream1= el.stream();
//		stream1.filter(e->e.getSalary()>25000.00).forEach(e->System.out.println(e));

		el.stream().filter(e->e.getSalary()>25000.00).forEach(e->System.out.println(e));
		
		
//		//
//	       // DEMO 1: Sort by EID using Comparable
//        System.out.println("\nSORT BY EID - COMPARABLE");
//
//        el.stream()
//                 .sorted()
//                 .forEach(System.out::println);
//
//
//        // DEMO 2: Sort by name using Comparator + Lambda
//        System.out.println("\nSORT BY NAME - COMPARATOR");
//
//        el.stream()
//                 .sorted(
//                     Comparator.comparing(
//                         (Employee e) -> e.getName()
//                     )
//                 )
//                 .forEach(System.out::println);
//
//
//        // DEMO 3: Sort by salary using Comparator + Lambda
//        System.out.println("\nSORT BY SALARY - COMPARATOR");
//
//        el.stream()
//                 .sorted(
//                     Comparator.comparingDouble(
//                         (Employee e) -> e.getSalary()
//                     )
//                 )
//                 .forEach(System.out::println);
//		
	}
}
