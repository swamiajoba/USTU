package cg;
interface Shape {
	public void area();
}
interface Shape3d {
	public void volume();
}

// class can implements multiple interface 
class Cube implements Shape,Shape3d {
	double side;
	// implementing Shape3d interface
	@Override
	public void volume() {
		double volume=side*side*side;
		System.out.println("Volume is Cube "+volume);
	}

	// Implementation of Shape interface
	@Override
	public void area() {
		double ar= 3*(side*side);
		System.out.println("Area of Cube "+ ar);
	}
}

public class Demo1 {

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
		//sd.area(); //error
		

	}

}
