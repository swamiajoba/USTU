package c2;

import java.util.*;

class EmployeeTreeSetDemo {
	public static void main(String args[]) {
		// Set is unordered ,no duplicates
		// create a TreeSet set
		// TreeSet is unordered, no duplicates but sorts the elements
		// while checking duplicate content element , it executes compareTo method
		// compareTo method is in Comparable interface, it is implemented in all predefined classes
		// checks for duplicates while adding elements
		/*
		 * In Employee if we do not implements Comparable interface, it throws exception while adding Employee
		 * Exception in thread "main" java.lang.ClassCastException: class cg1.Employee cannot be cast to class java.lang.Comparable (cg1.Employee is in unnamed module of loader 'app'; java.lang.Comparable is in module java.base of loader 'bootstrap')
			at java.base/java.util.TreeMap.compare(TreeMap.java:1291)
			at java.base/java.util.TreeMap.put(TreeMap.java:536)
			at java.base/java.util.TreeSet.add(TreeSet.java:255)
			at cg1.EmployeeTreeSetDemo.main(EmployeeTreeSetDemo.java:16)
		 * 
		 */
		// sorts the elements naturally
		Set<Employee>hs = new TreeSet<Employee>();
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
