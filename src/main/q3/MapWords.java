package main.q3;

import java.text.Normalizer;
import java.util.List;
import java.util.TreeMap;

public class MapWords {
	
	/**
	 *	Maps a word list in a list of tuples (key, value) where 
	 *	the key is the word and the value is the number of occurrences 
	 *	of that word.
	 *	@return a string representation of this map.
	 */
	public static String mapWords(List<String> wordsList) {
		
		// Saves, in order, the quantity of occurrences of a word, 
		//where the word is the own key to access it. 
		TreeMap<String, Integer> wordsMap = new TreeMap<String, Integer>();
		
		for(String item : wordsList) {
			
			//Transform a word to upper case and remove accentuation
			String word = normalize(item);
			//Gets the quantity of occurrences from 'word' already counted 
			Integer count = wordsMap.get(word);
			
			if(count !=null) {
				//Increase the counting
				wordsMap.replace(word, count+1); 
			}else{
				//Starts counting for a word discovered
				wordsMap.put(word,1); 
			}	
		}
		
		return wordsMap.toString(); //Returns the map in string format
	}
	
	/**
	 *	Transform a word to upper case and remove accentuation
	 *	@return a string in upper case and without accentuation characters
	 */
	public static String normalize(String word) {
		if(word != null)
			// Normalizer removes all non-ascii characters from the word
			return Normalizer.normalize(word.toUpperCase(), Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "");
		return null;
	}
	
}
