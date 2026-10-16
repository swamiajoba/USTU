package cg;

public class Exp6
{
	/*
		finally block gets executed whether exception occurs or does not occur.
		finally is written after try block ie try block is required
	*/
		public static void change(int salary) throws SalException
		{
			try {
				if (salary<=2000)  // at custom condition , we want to raise Exeception manully
				{
				// in order to raise exception manually , we use throw keyword
					throw new SalException("Invalid salary",salary);  // checked  // manually throw or raise exception
				
				}
			}
			finally {
				System.out.println("Change method finally");
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
			finally {
				System.out.println("main method finally");
			}
			
			System.out.println("The End");
		}
}
