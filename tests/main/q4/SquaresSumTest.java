package main.q4;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.*;

public class SquaresSumTest {
	
	@Test
	public void testIsPrime() {
		assertTrue(SquaresSum.isPrime(7));
	}
	@Test
	public void testIsNotPrime() {
		assertFalse(SquaresSum.isPrime(57));
	}
	@Test
	public void testSumSquaresOfPrimes() {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(4);
		numbers.add(7);
		numbers.add(57);
		numbers.add(37);
		Integer sumExpected = 1418;
		Integer sum = SquaresSum.sumSquaresOfPrimes(numbers);
		assertThat(sum, is(sumExpected));
	}
}
