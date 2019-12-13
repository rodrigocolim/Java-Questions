package main.q1;


public class ComplexNumber {

	private int real;		//The real part of a complex number
	private int imaginary;	//The imaginary part of a complex number
	
	/**
	 * Constructs a new ComplexNumber object with both real and 
	 * imaginary parts 0 (z = 0 + 0i).
	 */
	public ComplexNumber() {
		this.real=0;
		this.imaginary=0;
	}
	
	/**
	 * Constructs a new ComplexNumber object.
	 * @param real real part of the complex number
	 * @param imaginary imaginary part of the complex number
	 */
	public ComplexNumber(int x, int y) {
		this.real=x;
		this.imaginary=y;
	}
	
	/**
	 * Adds another ComplexNumber object to the current complex number.
	 * @param c complex number to add
	 */
	public void add(ComplexNumber c) {
		this.real+=c.real;
		this.imaginary+=c.imaginary;
	}

	/**
	 * Adds two ComplexNumber objects and return the result.
	 * @param a complex number one to add
	 * @param b complex number two to add
	 * @return new ComplexNumber resulting from the sum
	 */
	public static ComplexNumber add(ComplexNumber a, ComplexNumber b) {
		return new ComplexNumber(a.real+b.real, a.imaginary+b.imaginary);
	}
	
	/**
	 * @return a complex number in (x+y*i) format
	 */
	@Override
	public String toString() {
		return "("+this.real+"+"+this.imaginary+"*i)";
	}
	
	
}
