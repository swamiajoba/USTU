package questions;


class MyException1 extends Exception
{
	MyException1() {
		super("MyException1 is raised");
	}
}

class Test1 {
	public void show() throws MyException1 {
		throw new MyException1();
	}
}

public class Demo1 {
	public static void main(String rgs[] ) {
		Test1 ob=new Test1();
		try {
			ob.show();
		} catch (MyException1 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

