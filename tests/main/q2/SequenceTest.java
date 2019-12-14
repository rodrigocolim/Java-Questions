package main.q2;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class SequenceTest {
	
	@Test
	public void testGetNth() {
		
		int[] results = new int[6];
		results[0]=0;
		results[1]=1;
		results[2]=3;
		results[3]=6;
		results[4]=10;
		results[5]=15;
		
		for(int s, i = 0; i<6; i++) {
			s = Sequence.get_nth(i);
			assertThat(s,is(results[i]));
		}
		
	}
}
