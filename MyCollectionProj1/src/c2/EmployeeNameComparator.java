package c2;

import java.util.Comparator;

// Custom sorting using Employee name
public class EmployeeNameComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		String name1=e1.getName();
		String name2=e2.getName();
		int no=name1.compareTo(name2);
		return no;
	}

}
