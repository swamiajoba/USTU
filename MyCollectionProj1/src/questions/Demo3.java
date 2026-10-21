package questions;
import java.util.*;
public class Demo3 {

	public static void main(String[] args) {
		Map<Integer,String> c1=new HashMap<>();
		c1.put(100,"Ram");
		c1.put(200,"Sham");
		c1.put(300,"Krishna");
		c1.put(400,"Akshay");
		
		String myname=c1.get(300);
		
		System.out.println(myname);
		// extract only keys
		
		Set<Integer> keys=c1.keySet();
		System.out.println(keys);
		
		// extract only values
		Collection<String> values=c1.values();
		System.out.println(values);
		
	}

}
