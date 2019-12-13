package main.q2;

public class Sequence {
	/**
	 * Calculates, recursively, the n'th element in a sequence 
	 * where a n element corresponds to the sum of the previous 
	 * element with n-1, or 0, in case of the first element
	 * @return n'th element
	 */
	public static int get_nth(int n){
		if(n>1) {
			return get_nth(n-1)+n-1;
		}
		return 0;
	}
}
