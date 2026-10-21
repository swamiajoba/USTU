package questions;
import java.util.*;
class Emp1  implements Comparable<Emp1>{
	int eid;
	String name;
	public Emp1(int eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Emp1 o) {
		// TODO Auto-generated method stub
		return this.eid-o.eid;
	}
	
}

public class Demo6 {

	public static void main(String[] args) {
		List<Emp1> c1=new ArrayList<>();
		c1.add(new Emp1(100,"Ram"));
		c1.add(new Emp1(103,"Sham"));
		c1.add(new Emp1(102,"Krishna"));
		c1.add(new Emp1(101,"Akshay"));
	
		// natural sorting
		Collections.sort(c1);
		System.out.println(c1);
		
		//custom sorting by name
		System.out.println("=========================================");
		Comparator<Emp1> cmpname= (e1,e2)-> e1.name.compareTo(e2.name);
		
		Collections.sort(c1,cmpname);
		
		System.out.println(c1);
		
	}

}


/*
Comparator<Emp1> cmpname= (e1,e2)-> e1.name.compareTo(e2.name);

class NameComparator implements Comparator<Emp1> {
	public int compare(Emp1 e1,Emp1 e2) {
		return e1.name.compareTo(e2.name);
	}

}
 */
