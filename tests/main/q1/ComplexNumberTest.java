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
		a = new ComplexNumber();
		b = new ComplexNumber(2,5);
		c = new ComplexNumber(4,9);
	}
	
	@Test
	public void testAddComplexNumberByObject() {
		a.add(b);
		assertThat(a.toString(),is(b.toString()));
	}
	
	@Test
	public void testAddComplexNumberByClass() {
		ComplexNumber sum = ComplexNumber.add(b,c);
		ComplexNumber sumExpected = new ComplexNumber(6,14);
		assertThat(sum.toString(),is(sumExpected.toString()));
	}

}
