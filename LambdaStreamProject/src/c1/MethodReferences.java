package c1;

import java.time.LocalDateTime;

interface Printable
{
	public void print(Object o);
}

class MyShow
{
	public MyShow() {
		// TODO Auto-generated constructor stub
	}
	public MyShow(Object o) {
		System.out.println("MyShow Constructor "+o);
	}
	public void play(Object o)
	{
		System.out.println("Another Object instance method "+o);
	}
}

public class MethodReferences {
	public static void meth1(Object o)
	{
		System.out.println("Static method "+o);
	}
	public void meth2(Object o)
	{
		System.out.println("Imstance method "+o);
	}
	public static void main(String[] args) {
		// Referring Static metp1hod
//		Printable p1=MethodReferences::meth1;
//		p1.print("Welcome to method Reference");     /// print calls static meth1 method
		
		//Reference to an instance method of a particular object.
//		MethodReferences ob=new MethodReferences();
//		Printable p2=ob::meth2;
//		p2.print(LocalDateTime.now());    /// print calls meth2 method of MethodReferences object
		
		//Reference to an instance method of an arbitrary object of a particular type.
//		MyShow ob1=new MyShow();
//		Printable p3=ob1::play;
//		p3.print(new Integer(40));		// print calls play method of MyShow object
//		
		//Reference to a constructor.
//		Printable p4=MyShow::new;
//		p4.print(new Item("PC",34000.00));   /// print calls the constructor of MyShow
	}
}

/*

A method reference will call the method mentioned right side 
of �::� from the body of implemented only abstract method 
of Functional interface.

There are four types of method references:
1.	Reference to a static method.
2.	Reference to an instance method of a particular object.
3.	Reference to an instance method of an arbitrary object
 of a particular type.
4.	Reference to a constructor.

*/