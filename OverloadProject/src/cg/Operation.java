package cg;

public class Operation {
	// method overloading is called as static polymorphism
	// method overloading method name is same but 
	// parameters defer in sequence , data type , number of argument
	public void add(String a,String b)
	{
		System.out.println(a+b);
	}
	public void add(String a,double b)
	{
		System.out.println(a+b);
	}
	public void add(double a,String b)
	{
		System.out.println(a+b);
	}

	//variable arguments jdk1.5 onwords
	public void add(double ...a)   // n number of double parameters
	{
		System.out.println("Variable arguments method");
		double sum=0.0;
		for(double d:a)
		{
			sum+=d;
		}
		System.out.println(sum);
	
	}
	
	
	public void add(String s,double ...a)   // variable argument parameter is always last parameter
	{
		double sum=0.0;
		System.out.println(s);
		for(double d:a)
		{
			sum+=d;
		}
		System.out.println(sum);
	}
	
	
	/*
	public void add(double a,double b)
	{
		System.out.println(a+b);
	}
	
	public void add(double a,double b,double c)
	{
		System.out.println(a+b+c);
	}
	
	
	public void add(double a[])
	{
		double sum=0.0;
		for(double d:a)  //enhanced for loop
		{
			sum+=d;
		}
		System.out.println(sum);
	}
	*/
	
}



/*
 * method should accept multiple parameters of double
 * we use variable argument method
 * means add method can accept 2 double values, 3 double values , ... n double values
 * 
 * 
 * 
 * */




