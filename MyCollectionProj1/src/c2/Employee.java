package c2;

public class Employee implements Comparable{
	private int eid;
	private String name;
	private double salary;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int eid, String name, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Object o) {
		Employee e=  (Employee) o;
		// natural sorting is generally used with eid
		int diff=this.getEid() - e.getEid();
		System.out.println("Current object eid "+this.getEid() + " copared with Second object "+e.getEid());
		if(diff>0) {
			return 1;
		}
		else if (diff<0) {
			return -1;
		}
		else {
			return 0;
		}
		
	}
	
	
	

}
