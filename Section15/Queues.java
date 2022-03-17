package Section15;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queues {

	public static void main(String[] args) {
		//add, offer, poll, peek, remove
		
		//PQ - sorter - natural order
		
		Queue<String> queue = new PriorityQueue<>();
		
		queue.poll();
		queue.offer("Apple");
		queue.offer("Bat");
		queue.offer("Ant");
		
		System.out.println(queue);
		
	}

}
