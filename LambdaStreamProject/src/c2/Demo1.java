package c2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> locations = Arrays.asList(new String[]{"Pune","Mumbai","Chennai","Banglore","Noida"});
		
		System.out.println("\n===================");
		System.out.println("Display the contents "); 
		Stream<String> s1=locations.stream(); // convert list into stream so that its elements can be accessed sequentially
		
		s1.forEach(str->System.out.println(str));  // forEach accept Consumer and Consumer has method void accept(T t)
		
		System.out.println("\n===================");
		locations.stream().forEach(str->System.out.println(str));
		
		
	}

}
