package main.q4;

import java.util.ArrayList;

public class SquaresSum {
	
	/**
	 *	Checks if a number is prime
	 *	@number number to check if it's prime
	 *	@return true if the number is prime or false otherwise
	 */
	public static boolean isPrime(Integer number) {
		//2 is the first prime number 
		if(number < 2) {
			return false;
		}
		
		//Defines a limit to check
		int max = (int) Math.sqrt(number);
		for(int i = 2; i <= max; i++) {
			//Checks if i divides number
			if(number%i==0) {
				return false;
			}
		}
		//No divider for number found
		return true;
	}
	
	/**
	 *	Adds the square of all prime numbers in a list
	 *	@numbers list of numbers to sum 
	 *	@return the sum of all given prime numbers
	 */
	public static int sumSquaresOfPrimes(ArrayList<Integer> numbers) {
		//Initializes the sum
		int sum = 0;
		for(Integer number : numbers) {
			//Checks if number is prime
			if(isPrime(number)) {
				// Adds the square of the number to the sum
				sum += Math.pow(number,2);	
			}
		}
		return sum;
	}
}
