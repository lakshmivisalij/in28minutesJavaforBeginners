package Section15;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
	public static void main(String[] args) {
		
		List value = List.of("A", 'A', 1, 1.0);
		System.out.println(value.get(2));
		
		//Lists doesn't store primitive data types - They store the Wrapper Class Instances
		System.out.println(value.get(2) instanceof Integer);
		System.out.println(value.get(1) instanceof Character);
	
		List<Integer> numbers = List.of(101,102,103,104,105);
		System.out.println(numbers.indexOf(101));
		
		List<Integer> numbersAl = new ArrayList<>(numbers);
		
		System.out.println(numbersAl.indexOf(101));
		
		System.out.println(numbersAl.remove(Integer.valueOf(101)));
		
	}

}
