package Section17;

import java.util.stream.IntStream;

public class IntStreamRunner {

	public static void main(String[] args) {

		//List<Integer> list
		
		IntStream.range(0, 10).forEach(p->System.out.println(p));
		
		IntStream.range(1, 11).map(e -> e*e)
		.forEach(p->System.out.println(p));
		
		
	}

}
