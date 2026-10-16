package questions;

class MyException2 extends RuntimeException  // unchecked exception
{
	MyException2() {
		super("MyException2 is raised");
	}
}

class Test2 {
	public void show() {
		throw new MyException2();
	}
}

public class Demo2 {
	public static void main(String rgs[] ) {
		Test2 ob=new Test2();
		ob.show();
	}
}