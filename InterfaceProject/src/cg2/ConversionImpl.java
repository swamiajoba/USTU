package cg2;

public class ConversionImpl implements Conversion{
	// you must override abstract method of an Interface
	@Override
	public void show() {
		System.out.println("Abstract method -- show()");
		
	}

	// We can override optionaly the default method
//	@Override
//	public double calculateTax(double amount) {
//		// TODO Auto-generated method stub
//		return amount*0.05;
//	}
}
