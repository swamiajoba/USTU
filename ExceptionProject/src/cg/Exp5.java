package cg;

public class Exp5
{
	// change method is throwing NullPointerException
	// since NullPointerException is a unchecked exception,
	//  it will not be varified at compile time
	public static void change(int salary)
	{
		if (salary<=2000)  // at custom condition , we want to raise Exeception manully
		{
			// in order to raise exception manually , we use throw keyword
			throw new NullPointerException("Enter proper salary");  // unchecked  // manually throw or raise exception
			
		}
	}
	public static void main(String args[])
	{
		int a=0;
		try
		{
			a=Integer.parseInt(args[0]);
			change(a);
		}
		catch(Exception e)
		{
			System.out.println("Caught in main method");
			System.out.println(e.getMessage());	
			e.printStackTrace();
		}
		
		System.out.println("The End");
	}
}
