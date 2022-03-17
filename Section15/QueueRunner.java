package Section15;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return Integer.compare(o1.length(), o2.length());
		//Descending order of lengths
		//return Integer.compare(o2.length(), o1.length());
	}
	
}

public class QueueRunner {

	public static void main(String[] args) {
		
		Queue<String> queue = new PriorityQueue<>();
		queue.addAll(List.of("Zebra", "Monkey", "Cat"));
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());

		Queue<String> queu = new PriorityQueue<>(new StringLengthComparator());
		queu.addAll(List.of("Zebra", "Monkey", "Cat"));
		System.out.println(queu.poll());
		System.out.println(queu.poll());
		System.out.println(queu.poll());
		System.out.println(queu.poll());
	}

}
