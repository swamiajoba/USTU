package c2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> locations = Arrays.asList(new String[]{"Pune","Mumbai","Chennai","Banglore","Noida"});
		
		System.out.println("\n===================");
		System.out.println("Return all location length "); 
		Stream<String> s1=locations.stream(); // convert list into stream so that its elements can be accessed sequentially
		
		Stream<Integer> intstream =s1.map(str->str.length());  // map method accepts Function inteface which has method R apply(T t);
		// above map method accept String eg Pune and calculate length() ie 4 and 
		// 4 is a Integer so it will be stored into Stream<Integer>
		// this will happen for every element
		
		intstream.forEach(a->System.out.println(a));  // forEach accept Consumer and Consumer has method void accept(T t)
		
		System.out.println("\n===================");
		locations.stream().map(str->str.length()).forEach(a->System.out.println(a));
		
		
	}

}
