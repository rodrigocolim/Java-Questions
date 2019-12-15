package main.q2;

public class Sequence {
	/**
	 * Calculates, recursively, the n'th element in a sequence 
	 * where a n element corresponds to the sum of the previous 
	 * element with n, or 0, in case of the first element
	 * @param n position in the sequence
	 * @return n'th element
	 */
	public static int get_nth(int n){
		if(n>0) {
			//Returns a nth element as the previous element plus n
			return get_nth(n-1)+n;
		}
		//Returns the first element
		return 0;
	}
	
	/**
	 * Calculates, by tail recursive, the n'th element in a sequence 
	 * where a n element corresponds to the sum of the previous 
	 * element with n, or 0, in case of the first element
	 * @param n position in the sequence
	 * @param a recursion accumulator
	 * @return n'th element
	 */
	private static int tail_recursive_aux(int n, int a) {
		if(n==0) {
			//Returns the accumulator of all recursions as the nth element
			return a;
		}
		//Increments the accumulator and return a new recursion
		return tail_recursive_aux(n-1, n+a);
	}
	
	/**
	 * Calculates, by tail recursive, the n'th element in a sequence 
	 * where a n element corresponds to the sum of the previous 
	 * element with n, or 0, in case of the first element
	 * @param n position in the sequence
	 * @return n'th element
	 */
	public static int get_nth_by_tail_recursive(int n) {
		//Returns the call to a helper function that calculates the nth element
		//Start recursion accumulator at 0
		return tail_recursive_aux(n,0);
	}
	
	/**
	 * Calculates, iteratively, the n'th element in a sequence 
	 * where a n element corresponds to the sum of the previous 
	 * element with n, or 0, in case of the first element
	 * @param n position in the sequence
	 * @return n'th element
	 */
	public static int get_nth_iteratively(int n) {
		//Initialize the nth
		int nth = 0;
		for(int i=0; i<=n; i++) {
			//Adds the current element with the the iterator to compose the nth element corresponding
			nth += i;
		}
		return nth;
	}
}
