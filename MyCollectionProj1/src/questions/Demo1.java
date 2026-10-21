package questions;
import java.util.*;
public class Demo1 {

	public static void main(String[] args) {
		List<String> c1=new ArrayList<>();
		c1.add("Ram");
		c1.add("Sham");
		c1.add("Krishna");
		c1.add("Akshay");
		
		String name2=c1.get(2);
		System.out.println(name2);
		
		c1.add(2,"Lakshmi");
		String name3=c1.get(2);
		System.out.println(name3);
		
		System.out.println(c1);
		
	}

}
