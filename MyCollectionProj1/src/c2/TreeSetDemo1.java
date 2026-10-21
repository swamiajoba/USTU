package c2;

import java.time.LocalDate;
import java.util.*;

class TreeSetDemo1 {
	public static void main(String args[]) {
		// Set is unordered ,no duplicates
		// create a TreeSet set
		// TreeSet is unordered, no duplicates but sorts the elements
		// while checking duplicate content element , it executes compareTo method
		// checks for duplicates while adding elements
		// sorts the elements naturally
		Set<Integer> hs = new TreeSet<Integer>();
		// add elements to the hash set
		hs.add(333);
		hs.add(999);
		hs.add(444);
		hs.add(777);
		hs.add(111);
		hs.add(666);
	
		System.out.println("============> Accessing set using for each");

		for(Integer s:hs)
		{
			
			System.out.println(s);
		}
		
	
		
		
	}
}
