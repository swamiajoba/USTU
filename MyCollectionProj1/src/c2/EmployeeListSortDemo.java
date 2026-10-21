package c2;

import java.util.*;

class EmployeeListSortDemo {
	public static void main(String args[]) {
	
		List<Employee> el = new ArrayList<Employee>();
		// add elements to the ArrayList
		el.add(new Employee(100,"Ram",24000.00));
		el.add(new Employee(105,"Arjun",22000.00));
		el.add(new Employee(109,"Sham",28000.00));
		el.add(new Employee(104,"Krishna",27000.00));
		el.add(new Employee(102,"Ganesh",23000.00));
	
		System.out.println("============> Before Sorting");

		for(Employee e:el)
		{
			
			System.out.println(e);
		}
		
		System.out.println("============> Natural sorting by eid using Comparable");
		
		Collections.sort(el); // sorts elements naturally
		for(Employee e:el)
		{
			
			System.out.println(e);
		}
		
		System.out.println("============> Custom sorting by name using Comparator");
		// Custom sorting using Employee name
		Comparator namecomp=new EmployeeNameComparator();
		
		// pass this comparator object in sort method
		Collections.sort(el, namecomp);
		
		for(Employee e:el)
		{
			
			System.out.println(e);
		}
		
	}
}
