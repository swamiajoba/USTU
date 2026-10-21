package c2;

import java.time.LocalDate;
import java.util.*;

class TreeSetDemo2 {
	public static void main(String args[]) {
		// Set is unordered ,no duplicates
		// create a TreeSet set
		// TreeSet is unordered, no duplicates but sorts the elements
		// while checking duplicate content element , it executes compareTo method
		// checks for duplicates while adding elements
		// sorts the elements naturally
		Set<LocalDate> hs = new TreeSet<LocalDate>();
		// add elements to the hash set
		hs.add(LocalDate.now());
		hs.add(LocalDate.of(2022, 4, 24));
		hs.add(LocalDate.of(2021, 5, 12));

	
		System.out.println("============> Accessing set using for each");

		for(LocalDate s:hs)
		{
			
			System.out.println(s);
		}
		
	
		
		
	}
}
