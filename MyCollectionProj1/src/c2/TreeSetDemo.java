package c2;

import java.time.LocalDate;
import java.util.*;

class TreeSetDemo {
	public static void main(String args[]) {
		// Set is unordered ,no duplicates
		// create a TreeSet set
		// TreeSet is unordered, no duplicates but sorts the elements
		// while checking duplicate content element , it executes compareTo method
		// checks for duplicates while adding elements
		// sorts the elements naturally
		Set<String> hs = new TreeSet<String>();
		// add elements to the hash set
		hs.add("Ram");
		hs.add("Sham");
		hs.add("Krishna");
		hs.add("Durga");
		hs.add("Ganesh");
		hs.add("Arjun");
	
		System.out.println("============> Accessing set using for each");

		for(String s:hs)
		{
			
			System.out.println(s);
		}
		
	
		
		
	}
}
