package Section17;

import java.util.List;

public class FunctionalProgrmmingRunner {

	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Banana", "Cat", "Dog");

		
		printBasic(list);
		printWithFP(list);
		printBasicWithFiltering(list);
		printWithFPithFiltering(list);
	}

	private static void printBasic(List<String> list) {
		for(String string:list) {
			
			System.out.println(string);
		}
	}
	
	private static void printWithFP(List<String> list) {
		//lambda expression
		list.stream().forEach(element ->System.out.println(element));	
		}

	private static void printBasicWithFiltering(List<String> list) {
		for(String string:list) {
			if(string.endsWith("at")) {
			System.out.println(string);
			}
		}
	}
	
	private static void printWithFPithFiltering(List<String> list) {
		//lambda expression
		list.stream()
		.filter(element -> element.endsWith("at"))
		.forEach(element ->System.out.println(element));	
		}
	
	
	
}
