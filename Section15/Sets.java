package Section15;

import java.util.HashSet;
import java.util.Set;

public class Sets {
	public static void main(String[] args) {
	
	//Sets - no duplicates allowed
	// No order followed
	
	Set<String> set = Set.of("Apple", "Banana", "Cat");
	
	System.out.println(set);
	
	Set<String> hashSet = new HashSet<>(set);
	System.out.println(hashSet);
	
	
	}

}
