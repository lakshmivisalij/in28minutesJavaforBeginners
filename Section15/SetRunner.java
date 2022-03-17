package Section15;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

	public static void main(String[] args) {
		List<Character> chars = List.of('A', 'B', 'A','Z', 'A', 'F' );
		
		//unique - set
		//Tree, Hash, LinkedHash
		
		//Sorted Order
		Set<Character> treeSet = new TreeSet<>(chars);
		System.out.println("treeSet" + treeSet);
		
		//Insertion Order
		Set<Character> linkedHashSet = new LinkedHashSet<>(chars);
		System.out.println("Linked Hash set" + linkedHashSet);
		
		//No order
		Set<Character> hashSet = new HashSet<>(chars);
		System.out.println("HashSet" + hashSet);

	}

}
