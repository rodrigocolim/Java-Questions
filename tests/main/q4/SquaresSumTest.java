package main.q4;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.*;

public class SquaresSumTest {
	
	@Test
	public void testIsPrime() {
		// Checks if the isPrime method identify a prime number 
		assertTrue(SquaresSum.isPrime(7));
	}
	@Test
	public void testIsNotPrime() {
		// Checks if the isPrime method identify a non prime number 
		assertFalse(SquaresSum.isPrime(57));
	}
	@Test
	public void testSumSquaresOfPrimes() {
		// Sets a list of numbers
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(4);
		numbers.add(7);
		numbers.add(57);
		numbers.add(37);
		
		// Sets the sum expected for the list
		Integer sumExpected = 1418;
		
		Integer sum = SquaresSum.sumSquaresOfPrimes(numbers);
		assertThat(sum, is(sumExpected));
	}
}
