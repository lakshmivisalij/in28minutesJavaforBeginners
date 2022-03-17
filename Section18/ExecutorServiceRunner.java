package Section18;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunner {

	public static void main(String[] args) {
	//	ExecutorService executorService = Executors.newSingleThreadExecutor();
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		executorService.execute(new Task1());
		executorService.execute(new Thread(new Task2()));
		
		executorService.shutdown();

	}

}
