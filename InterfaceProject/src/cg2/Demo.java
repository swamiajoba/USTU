package cg2;

public class Demo {

	public static void main(String[] args) {
		Conversion c=new ConversionImpl();
		
		// call abstract method
		c.show();
		
		// call default method declared and defined in an interface Conversion
		double res=c.calculateTax(10000.00);
		System.out.println("Tax is "+res);
		
		// call static method declared and defined in an interface Conversion
		double rs=Conversion.dollarToRs(100);
		System.out.println("100 dollars = "+rs + " Rs.");

	}

}
