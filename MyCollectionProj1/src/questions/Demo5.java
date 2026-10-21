package questions;
import java.util.*;
class Emp  implements Comparable<Emp>{
	int eid;
	String name;
	public Emp(int eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Emp o) {
		// TODO Auto-generated method stub
		return this.eid-o.eid;
	}
	
}

public class Demo5 {

	public static void main(String[] args) {
		List<Emp> c1=new ArrayList<>();
		c1.add(new Emp(100,"Ram"));
		c1.add(new Emp(103,"Sham"));
		c1.add(new Emp(102,"Krishna"));
		c1.add(new Emp(101,"Akshay"));
	
		// natural sorting
		Collections.sort(c1);
		
		System.out.println(c1);
	}

}
