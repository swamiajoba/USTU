package questions;
class A3 {
	public void show() {
		try {   	int x=100/0;  	}
		finally {   System.out.println("Finally in A3");   	}
	}
}
public class Demo3 {
	public static void main(String[] args) {
	try {
		A3 ob=new A3();
		ob.show();
	}
	catch(Exception e) {
		System.out.println(e);
	}
	finally {
		System.out.println("Finally in main");
	}

	}

}
