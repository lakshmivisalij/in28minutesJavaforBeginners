package Section15;

import java.util.TreeMap;

public class TreeMaps {

	public static void main(String[] args) {
		TreeMap<String, Integer> treemap = new TreeMap<>();
		treemap.put("Z", 5);
		treemap.put("A", 15);
		treemap.put("F", 25);
		treemap.put("L", 250);
		treemap.put("B",25);
		treemap.put("G",25);
		
		System.out.println(treemap);
		
		//greater than
		System.out.println(treemap.higherKey("B"));
		
		//>=
		System.out.println(treemap.ceilingKey("B"));
		
		//lessthan
		System.out.println(treemap.lowerKey("B"));
		
		//<=
		System.out.println(treemap.floorKey("B"));
		
		System.out.println(treemap.firstEntry());
		System.out.println(treemap.lastEntry());
		
		System.out.println(treemap.subMap("C", "Y"));
		System.out.println(treemap.subMap("B", "Z"));
		System.out.println(treemap.subMap("B", true, "Z", true));
		System.out.println(treemap.subMap("C", true, "Y", false));
	}

}
