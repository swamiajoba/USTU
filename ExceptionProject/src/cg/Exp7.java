package cg;

public class Exp7
{
	// change method is throwing SalException
	// since SalException is a checked exception since it is extending Exception class,
	//  it will  be varified at compile time,
	// in this case we have either to write try catch inside change method
	// or else declare that change method will throw checked exception  method signature
	// in order to declare we use throws clause
	public static void change(int salary) throws SalException
	{
			if (salary<=2000)  // at custom condition , we want to raise Exeception manully
			{
			// in order to raise exception manually , we use throw keyword
				throw new SalException("Invalid salary",salary);  // checked  // manually throw or raise exception
			
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
