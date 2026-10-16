package cg1;
interface Shape {
	public void area();
}

// one interface can extends another interface
interface Shape3d extends Shape{
	public void volume();
}

// class can implements sub interface 
// u must override super as well as subinterface
class Cube implements Shape3d {
	double side;
	// implementing Shape3d sub interface
	@Override
	public void volume() {
		double volume=side*side*side;
		System.out.println("Volume is Cube "+volume);
	}

	// Implementation of Shape super interface
	@Override
	public void area() {
		double ar= 3*(side*side);
		System.out.println("Area of Cube "+ ar);
	}
}

public class Demo2 {

	public static void main(String[] args) {
		Cube ob=new Cube();
		ob.side=7.00;
		ob.area();
		ob.volume();
		
		Shape s=ob;  // Shape is pointing to Cube
		s.area();  
		//s.volume(); // error
		
		Shape3d sd=ob;// // Shape3d point to Cube
		sd.volume();
		sd.area(); // can call super interface method also
		

	}

}
