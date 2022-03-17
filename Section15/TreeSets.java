package Section15;

import java.util.Set;
import java.util.TreeSet;

public class TreeSets {

	public static void main(String[] args) {
		//TreeSet implements NavigableSet Interface
		
		TreeSet<Integer> numbers = new TreeSet<>(Set.of(65,54,34,12,99));

		System.out.println(numbers.floor(34));
		System.out.println(numbers.floor(40));
		
		numbers.ceiling(34);
		numbers.ceiling(36);
		
		numbers.higher(34);
		
		numbers.subSet(20, 80);
		numbers.subSet(34, 65);
		
		numbers.subSet(34, true, 65, true);
		}

}
