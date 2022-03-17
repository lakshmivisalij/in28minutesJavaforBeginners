package Section15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
		
		List<String> words = List.of("Apple", "Bat", "Cat");
		
		for(int i=0;i<words.size();i++) {
			System.out.println(words.get(i));
		}
		
		for(String word:words) {
			System.out.println(word);
		}
		
		Iterator wordsIterator = words.iterator();
		while(wordsIterator.hasNext()) {
			System.out.println(wordsIterator.next());
		}
		
		List<String> wordsAl = new ArrayList<>(words);
		
		for(String word:words) {
			if(word.endsWith("at")) {
				System.out.println(word);
			}
		}
		
		//Can't delete all the words using for loop - use iterator instead
		for(String word:wordsAl) {
			if(word.endsWith("at")) {
				wordsAl.remove(word);
			}
		}
		
		System.out.println(wordsAl);
		
		Iterator<String> iterator1 = wordsAl.iterator();
		while(iterator1.hasNext()) {
			if(iterator1.next().endsWith("at")) {
				iterator1.remove();
			}
		}
		
		System.out.println(wordsAl);
		
		
	}

}
