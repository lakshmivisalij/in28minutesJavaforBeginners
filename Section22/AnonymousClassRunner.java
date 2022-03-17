package Section22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnonymousClassRunner {

	public static void main(String[] args) {
		List<String> animals = new ArrayList<String>(List.of("Apple", "Cat", "Ball", "Elephant"));
		Collections.sort(animals, 
				new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.length(), o2.length());
			}
			
			
		});
		System.out.println(animals);

	}

}
