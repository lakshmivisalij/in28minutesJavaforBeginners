package Section17;

import java.util.List;
import java.util.stream.IntStream;

public class TerminalOpsMax {

	public static void main(String[] args) {
		int sum2 = IntStream.range(1,11)
		.reduce(0, (n1,n2)->n1+n2);
		System.out.println(sum2);
		
		 int k = List.of(23,12,34,53).stream().max((n1,n2) -> Integer.compare(n1,n2)).get();
		System.out.println(k);
	
	}

}
