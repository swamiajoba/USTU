package c2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listint=Arrays.asList(11,3,44,5,66,44,33,44);
		
		
		System.out.println("\n===================");
		System.out.println(" first 3 numbers "); 
		Stream<Integer> intstream=listint.stream();
		Stream<Integer> newintstream=intstream.limit(3);
		// limit method takes element till n number which is passed in limit(n) method
		// In above it select only first 3 elements and
		//  stored it in new Stream<Integer>
		newintstream.forEach(arg->System.out.println(arg));
		System.out.println("\n===================");
		// 3 numbers
		listint.stream().limit(3).forEach(arg->System.out.println(arg));
		
		
	}

}
