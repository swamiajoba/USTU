package c2;

import java.util.*;

class EmployeeTreeSetDemo2 {
	public static void main(String args[]) {
		// Custom sorting using Employee name
		Comparator namecomp=new EmployeeNameComparator();
		// pass this comparator object in TreeSet constructor for custom sorting
		// sorts the elements naturally
		Set<Employee>hs = new TreeSet<Employee>(namecomp);
		// nown TreeSet executes compare method of EmployeeNameComarator while adding Employee
		// add elements to the hash set
		hs.add(new Employee(100,"Ram",24000.00));
		hs.add(new Employee(105,"Arjun",22000.00));
		hs.add(new Employee(109,"Sham",28000.00));
		hs.add(new Employee(104,"Krishna",27000.00));
		hs.add(new Employee(102,"Ganesh",23000.00));
	
		System.out.println("============> Accessing set using for each");

		for(Employee e:hs)
		{
			
			System.out.println(e);
		}
		
	
		
		
	}
}
