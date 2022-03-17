package Section17;

import java.util.List;
import java.util.Optional;

public class OptionalRunner {

	public static void main(String[] args) {
		
		Optional<Integer> i =List.of(23,45,67,12).stream().filter(n->n%2==0)
		.max((n1,n2) ->Integer.compare(n1, n2));
		
		System.out.println(i);
	}

}
