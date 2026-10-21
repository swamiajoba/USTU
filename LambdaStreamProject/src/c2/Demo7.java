package c2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listint=Arrays.asList(11,3,44,5,66,44,33,44);
		
		
		System.out.println("\n===================");
		System.out.println(" Sum of the numbers "); 
		Stream<Integer> intstream=listint.stream();
		int sumres=intstream.collect(Collectors.summingInt(i->i));
		System.out.println("Sum is "+sumres);
		
		System.out.println("\n===================");
		System.out.println("Sum of the numbers");
		int sum=listint.stream().collect(Collectors.summingInt(i->i));
		System.out.println("Sum is "+sum);
		
		
	}

}
