package Section17;

import java.util.List;

public class LambdaExp {

	public static void main(String[] args) {
		
		List<Integer> list = List.of(1,4,7,9);
		
		list.stream().forEach(element ->System.out.println(element));
		
		printOddWithFilter(list);		
		
	}
	
	private static void printOddWithFilter(List<Integer> list) {
		//lambda expression
		list.stream()
		.filter(element -> Integer.valueOf(element)%2 == 1)
		.forEach(element ->System.out.print(element));	
		}
	

}
