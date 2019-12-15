package main.q1;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Before;
import org.junit.Test;

public class ComplexNumberTest {
	
	private ComplexNumber a;
	private ComplexNumber b;
	private ComplexNumber c;

	@Before
	public void setUp() {
		// Creating complex numbers to manipulate in tests
		a = new ComplexNumber();
		b = new ComplexNumber(2,5);
		c = new ComplexNumber(4,9);
	}
	
	@Test
	public void testAddComplexNumberByObject() {
		// Adds b to a
		a.add(b);
		//Since all parts of a are equal to 0, the result must be equal to b
		assertThat(a.toString(),is(b.toString()));
	}
	
	@Test
	public void testAddComplexNumberByClass() {
		//Adds b and c to another complex number
		ComplexNumber sum = ComplexNumber.add(b,c);
		//Creates the complex number expected as the result of the sum
		ComplexNumber sumExpected = new ComplexNumber(6,14);
		assertThat(sum.toString(),is(sumExpected.toString()));
	}

}
