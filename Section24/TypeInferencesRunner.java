package Section24;

import java.util.List;

public class TypeInferencesRunner {

	public static void main(String[] args) {
		List<String> names1 = List.of("Ranga","Ravi");
		List<String> names2 = List.of("John","Adam");
		
		var names = List.of(names1, names2);
		
		names.stream()
		.forEach(System.out::println);		
		
	}

}
