package Section15;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsHashSets {

	public static void main(String[] args) {
		Set<Integer> numbers = new HashSet<Integer>();
		numbers.add(76543);
		numbers.add(7654);
		numbers.add(765);
		numbers.add(76);
		
		System.out.println(numbers);
		
		Set<Integer> numbers1 = new LinkedHashSet<Integer>();
		numbers1.add(76543);
		numbers1.add(7654);
		numbers1.add(765);
		numbers1.add(76);
		
		System.out.println(numbers1);
		
		Set<Integer> numbers2 = new TreeSet<Integer>();
		numbers2.add(76543);
		numbers2.add(7654);
		numbers2.add(765);
		numbers2.add(76);
		
		System.out.println(numbers2);
	}
	
	

}
