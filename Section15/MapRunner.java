package Section15;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		String str = "This is an awesome occasion. " + 
					"This has never happened before.";
		
		Map<Character, Integer> occs = new HashMap<>();
		
		char[] chars = str.toCharArray();
		
		for(char charac: chars) {
			//Get the character
			Integer integer = occs.get(charac);
			
			
			//if it is there, we increment the count
			
			if(integer ==null) {
				occs.put(charac, 1);
			}
			
			//else, initialize count to 1
			else {
				occs.put(charac, integer + 1);
			}
		}
		
		System.out.println(occs);

Map<String, Integer> stroccs = new HashMap<>();
		
		String[] chars1 = str.split(" ");
		
		for(String charac: chars1) {
			//Get the character
			Integer integer = stroccs.get(charac);
			
			
			//if it is there, we increment the count
			
			if(integer ==null) {
				stroccs.put(charac, 1);
			}
			
			//else, initialize count to 1
			else {
				stroccs.put(charac, integer + 1);
			}
		}
		
		System.out.println(stroccs);

	}

}
