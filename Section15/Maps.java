package Section15;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

	public static void main(String[] args) {
		//Key-Value Pairs
		//HashMap - unsorted, unordered, stores null
		//HashTable - Synchronized like Vector(thread - safe), unsorted and unordered, doesn't allow null unlike hashmap
		// LinkedHashMap - insertion order is maintained, slower insertion and deletion, faster iteration
		// TreeMap - data is stored in sorted manner, implements both Map and NavigableMap
		
		//Basic Operations
		//Anything that is created with .of is immutable
		Map<String, Integer> map = Map.of("A", 3, "B", 5, "Z", 10);
		System.out.println(map);
		
		map.get("z");
		map.size();
		map.isEmpty();
		map.containsKey("A");
		map.containsValue(3);
		map.keySet();
		map.values();
		
	Map<String, Integer> hashMap = new HashMap<>(map);
	hashMap.put("F", 5);
	System.out.println(hashMap);
	
	hashMap.put("Z", 11);
	System.out.println(hashMap);
	
	//DIFFERENCES BETWEEN DIFFERENT MAPS
	
	HashMap<String, Integer> hashmap = new HashMap<>();
	hashmap.put("Z", 5);
	hashmap.put("A", 15);
	hashmap.put("F", 25);
	hashmap.put("L", 250);
	
	System.out.println(hashmap);
	
	
	LinkedHashMap<String, Integer> linkedHM = new LinkedHashMap<>();
	linkedHM.put("Z", 5);
	linkedHM.put("A", 15);
	linkedHM.put("F", 25);
	linkedHM.put("L", 250);
	
	System.out.println(linkedHM);
	
	TreeMap<String, Integer> treemap = new TreeMap<>();
	treemap.put("Z", 5);
	treemap.put("A", 15);
	treemap.put("F", 25);
	treemap.put("L", 250);
	
	System.out.println(treemap);
	
	}

}
