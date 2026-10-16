package cg2;

public interface Conversion {
	public void show();  // abstract method
	
	// default method -- common instructions
	public default double calculateTax(double amount) {
		return amount*0.02;
	}
	
	// static method -- fixed instructions
	public static double dollarToRs(double dallar) {
		return dallar*75.00;
	}
}
