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
		String name = "Joãõ";
		String nameExpected = "JOAO";
		String nameNormalized = MapWords.normalize(name);
		assertThat(nameNormalized, is(nameExpected));
	}
	
	@Test
	public void testMapWords() {
		List<String>  words = new ArrayList<String>();
		words.add("Pedro");
		words.add("João");
		words.add("Maria");
		words.add("JOAO");
		words.add("Alberto");
		words.add("João");
		words.add("MARiA");
		
		String expectedResult = "{ALBERTO=1, JOAO=3, MARIA=2, PEDRO=1}";
	
		String map = MapWords.mapWords(words);
		assertThat(map, is(expectedResult));
		
	}
	
}
