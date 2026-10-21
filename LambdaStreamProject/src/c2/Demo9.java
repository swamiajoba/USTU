package c2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listint=Arrays.asList(11,3,44,5,66,44,33,44);
		
		
		System.out.println("\n===================");
		System.out.println("Print arrays in sorted manner");
		Stream<Integer> intstream=listint.stream();
		Stream<Integer> newintstream=intstream.sorted();
		// sorted method sorts integer naturally by Comparable
		// and return sorted Stream<Integer>
		
		newintstream.forEach(System.out::println);
		
		System.out.println("\n===================");
		System.out.println("Print arrays in sorted manner");
		listint.stream().sorted().forEach(System.out::println);
		
		
	}

}
