package c2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listint=Arrays.asList(11,3,44,5,66,44,33,44);
		
		
		System.out.println("\n===================");
		System.out.println(" print distinct numbers ie no duplicates "); 
		Stream<Integer> intstream=listint.stream();
		Stream<Integer> newintstream=intstream.distinct();
		// distinct method takes element and checks whether same element exist previously
		// if it exist then that element will not be selected
		// only unique element will be selected and stored it in new Stream<Integer>
		newintstream.forEach(arg->System.out.println(arg));
		System.out.println("\n===================");
		listint.stream().distinct().forEach(arg->System.out.println(arg));
		
		
	}

}
