package Section21;

public class ConcurrenyRunner {

	public static void main(String[] args) {
		Counter counter = new Counter();
		counter.increment();
		counter.increment();
		counter.increment();
		System.out.println(counter.getI());
	}

}
