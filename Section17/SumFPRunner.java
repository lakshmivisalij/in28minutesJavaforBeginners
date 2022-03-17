package Section17;

import java.util.List;

public class SumFPRunner {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1,2,3,4,6,8,7);

		numbers.stream().forEach(element -> System.out.println(element));
		
		//loop
		int sum = normalSum(numbers);
		System.out.println(sum);
		
		// terminal ops -reduce
		sum = numbers.stream().reduce(0, (number1, number2)-> number1 + number2);
		System.out.println(sum);
		
		//odd numbers
		//intermediate ops - filter
		sum = numbers.stream()
				.filter(element -> element%2==1)
				.reduce(0, (number1, number2)-> number1 + number2);
		System.out.println(sum);
		
		//sort - intermediate
		numbers.stream().sorted()
		.forEach(e ->System.out.print(e + " "));
		System.out.println();
		
		//distinct
		numbers.stream().distinct()
		.forEach(e ->System.out.print(e + " "));
		System.out.println();
		
		//sorted
		numbers.stream().distinct().sorted()
		.forEach(e ->System.out.print(e + " "));
		System.out.println();
		
		//map
		numbers.stream().distinct().map(e -> e*e)
		.forEach(e ->System.out.print(e + " "));
	}

	private static int normalSum(List<Integer> numbers) {
		int sum = 0;
		for(int number:numbers) {
			sum+=number; //mutations
		}
		return sum;
	}

}
