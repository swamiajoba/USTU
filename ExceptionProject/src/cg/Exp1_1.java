package cg;

public class Exp1_1
{
	public static void change(int x)
	{
		int y=55/x; 
	}
	public static void main(String args[])  
	{

		int a=0;
		
		a=Integer.parseInt(args[0]);
			change(a);
		
		System.out.println("The End");
	}
}

// args[0] = "5"   // normal execution
// args[0]= "aa"		//throws NumberFormatException: For input string: "aa"
// args[0]= nothing   //  ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
// args[0] = "0"
/*
 	following exception is propagated from change method to main method
  Exception in thread "main" java.lang.ArithmeticException: / by zero
	at cg.Exp1_1.change(Exp1_1.java:7)
	at cg.Exp1_1.main(Exp1_1.java:18)
 */