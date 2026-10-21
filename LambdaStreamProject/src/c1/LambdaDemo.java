package c1;
@FunctionalInterface
interface SayHello
{
	public void say();
	//public void show();   // error
}
interface PrintMsg
{
	public void print(String str);
	//public void show();  // no error
}
interface LengthFinder
{
	public int findLength(String s);
}
interface Calculator
{
	public double add(double a,double b);
}


public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SayHello s=()->System.out.println("Hello! Welcome ");
		s.say();
		
		PrintMsg p= str->System.out.println(str);
		p.print("UCOE");
		
		//LengthFinder l=a->a.length();
		LengthFinder l=(String a)->  { 
			int len=a.length();
			return len;
		};
		int le=l.findLength("Universal College of Engineering");
		System.out.println(le);
	}

}
