package main.q2;

import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Before;

import static org.hamcrest.CoreMatchers.*;

public class SequenceTest {
	
	private int[] sequence;
	private int sequenceSize;
	
	@Before
	public void setUp() {
		// Sets a sequence
		sequenceSize = 7;
		sequence = new int[sequenceSize];
		sequence[0]=0;
		sequence[1]=1;
		sequence[2]=3;
		sequence[3]=6;
		sequence[4]=10;
		sequence[5]=15;
		sequence[6]=21;
	}
	
	@Test
	public void testGetNth() {
		// Checks the recursive method for all sequence
		for(int s, i = 0; i<sequenceSize; i++) {
			s = Sequence.get_nth(i);
			assertThat(s,is(sequence[i]));
		}
		
	}
	
	@Test
	public void testGetNthByTailRecursive() {
		// Checks the tail recursive method for all sequence
		for(int s, i = 0; i<sequenceSize; i++) {
			s = Sequence.get_nth_by_tail_recursive(i);
			assertThat(s,is(sequence[i]));
		}
	}
	
	@Test
	public void testGetNthIteratively() {
		// Checks the iterative method for all sequence
		for(int s, i = 0; i<sequenceSize; i++) {
			s = Sequence.get_nth_by_tail_recursive(i);
			assertThat(s,is(sequence[i]));
		}
	}
}
