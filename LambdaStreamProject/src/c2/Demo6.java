package c2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listint=Arrays.asList(11,3,44,5,66,44,33,44);
		
		
		System.out.println("\n===================");
		System.out.println(" count numbers "); 
		Stream<Integer> intstream=listint.stream();
		long countofint=intstream.count();  // terminating method
		// count method takes element and count total number of element inside Steam
		// and return that count as long number
		System.out.println("Count "+countofint);
		
		System.out.println("\n===================");
		// count numbers
		long c=listint.stream().count();
		System.out.println("Count "+c);
		
		
	}

}
