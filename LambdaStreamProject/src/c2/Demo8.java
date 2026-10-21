package c2;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listint=Arrays.asList(11,3,44,5,66,44,33,44);
		
		
		System.out.println("\n===================");
		System.out.println(" Sum of the numbers "); 
		Stream<Integer> intstream=listint.stream();
		Optional<Integer> intopres=intstream.reduce((a,b)->a+b);
		// reduce method accepts BinaryOperator extend BiFunction
		// this has method    T apply(T t, T u);
		// in reduce in will add elements a and b recurrsively
		// and return result in Optional<Integer>
		int sumres=intopres.get();
		System.out.println("Sum is "+sumres);
		
		System.out.println("\n===================");
		Optional<Integer> opres=listint.stream().reduce((a,b)->a+b);
		int sum1=opres.get();
		System.out.println("Sum is"+sum1);
		
		
	}

}
