package Section17;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TerminalOpsMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int k = List.of(23,12,34,53).stream().min((n1,n2) -> Integer.compare(n1,n2)).get();
			System.out.println(k);
			
		  List.of(23,12,34,53).stream()
				 .filter(e -> e%2==1).forEach(e->System.out.println(e));
				 //.min((n1,n2) -> Integer.compare(n1,n2)).get();
				//System.out.println(k);
		 List<Integer> list1 =  List.of(23,12,34,53).stream()
			 .filter(e -> e%2==1)
			 .collect(Collectors.toList());
		 System.out.println(list1);
		 
		 //even
		 List<Integer> list2 =  List.of(23,12,34,53).stream()
				 .filter(e -> e%2==0)
				 .collect(Collectors.toList());
			 System.out.println(list2);
			 
		//squares till 11
			 
		List<Integer> list3 = IntStream.range(1, 11).map(e->e*e)
		.boxed().collect(Collectors.toList());
		
		System.out.println(list3);
		
	}

}
