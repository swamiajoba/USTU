package c2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listint=Arrays.asList(11,3,44,5,66,44,33,44);
		
		
		System.out.println("\n===================");
		System.out.println(" Count duplicate numbers count "); 
		Stream<Integer> intstream=listint.stream();
		Map<Integer,List<Integer>> countmap= intstream.collect(Collectors.groupingBy(Integer::intValue));
		Set<Integer> intkeys=countmap.keySet();
		Stream<Integer> keystream=intkeys.stream();
		keystream.forEach(i->System.out.println("Int - "+i + ", Count -> "+countmap.get(i).stream().count()));
		
		System.out.println("\n===================");
		System.out.println(" Count duplicate numbers count "); 
		Stream<Integer> intstream1=listint.stream();
		Map<Integer,List<Integer>> countmap1= intstream1.collect(Collectors.groupingBy(Integer::intValue));
		
		countmap1.forEach((key,value)->System.out.println("Int ->"+key + " , Count "+value.stream().count()));  // forEach accepts BiConsumer
		
		
	}

}
