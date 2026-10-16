package cg3;
// functional interface
@FunctionalInterface
interface Tax
{
	// method with parameter -- single abstract method - SAM
	public void caltax(double amount);
}

public class Demo3 {

	public static void main(String[] args) {
		
		System.out.println("New Feature in Java 8 - Lambda expression  for method with parameter ");
//		 Tax ob1=(double amount)->{ System.out.println("Tax is "+(0.20*amount)); };  
//			Tax ob1=(amount)->{ System.out.println("Tax is "+(0.30*amount)); }; // omit datatype
		Tax ob1=amount->{ System.out.println("Tax is "+(0.40*amount)); };  // omit brackets
		 ob1.caltax(10000.00);
		 
		

	}

}


/*
When interface has only single abstract method (SAM) , then
that interface is called as functional interface.
For functional interface, we can generate lambda instread of annonymous inner class

*/