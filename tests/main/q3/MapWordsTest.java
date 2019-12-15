package main.q3;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;


public class MapWordsTest {
	
	@Test
	public void testNormalize() {
		
		String name = "Joãõ";								// Sets an unnormalized word
		String nameExpected = "JOAO";						// Sets the normalization for the word
		String nameNormalized = MapWords.normalize(name);	// Runs the normalizer method
		assertThat(nameNormalized, is(nameExpected));		// Checks the result
	}
	
	@Test
	public void testMapWords() {
		// Sets a list of word
		List<String>  words = new ArrayList<String>();
		words.add("Pedro");
		words.add("João");
		words.add("Maria");
		words.add("JOAO");
		words.add("Alberto");
		words.add("João");
		words.add("MARiA");
		
		// Sets the list normalized as a string
		String expectedResult = "{ALBERTO=1, JOAO=3, MARIA=2, PEDRO=1}";
	
		//Checks the map method for words
		String map = MapWords.mapWords(words);
		assertThat(map, is(expectedResult));
		
	}
	
}
