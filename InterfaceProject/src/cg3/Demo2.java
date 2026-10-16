package cg3;

abstract class Shape
{
	public abstract void area();
}
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Annonymous Inner Class
		System.out.println("Annonymous Inner Class");
		Shape ob=new Shape()
		{ //subclass of abstract class Shape without any name will be generated
			// annonymous inner class
			public void area() {
			System.out.println("Area is "+(20*10));	
			}
		};
		
		ob.area();


	}

}


