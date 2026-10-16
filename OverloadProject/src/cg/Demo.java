package cg;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation ob=new Operation();
		ob.add("10","12");
		ob.add("10",12);
		ob.add(10,"12");
		ob.add(10.67,12.11);
		ob.add(10.67,12.11,22.55);
		double x[]={34.565,32.989,767.878,11.11,99.34};
		ob.add(x);
		
		ob.add(44.0,66.0,77.0,22.0,66.0,88.0,99.0,55.0);
		ob.add("Different ",10,20,.0,30.5);
	}

}
