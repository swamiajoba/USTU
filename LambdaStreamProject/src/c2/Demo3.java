package c2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listint=Arrays.asList(11,3,44,5,66,44,33,44);
		
		
		System.out.println("\n===================");
		System.out.println(" print numbers greater than 10 "); 
		Stream<Integer> intstream=listint.stream();  // list is converted to stream
		Stream<Integer> newintstream=intstream.filter(a-> a>10);  // fileter accept Interface Predicate which has method boolean test(T t);
		// filter method checks that element whether it is greater than 10
		// if it is greater than 10 then it will return new Stream<Integer> 
		// having element>10
		newintstream.forEach(arg->System.out.println(arg));
		
		System.out.println("\n===================");
		listint.stream().filter(arg->arg>10).forEach(arg->System.out.println(arg));
		
		
	}

}
