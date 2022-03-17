package Section18;

class Task1 extends Thread {
	public void run() { //SIGNATURE MATCH
		for(int i=101; i<=199; i++) {
			System.out.print(i+" ");
		}
		System.out.println("Task1 Done");
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		
		for(int i=201; i<=299; i++) {
			System.out.print(i+" ");
		}
		System.out.println("Task2 Done");
		
	}
	
}

public class ThreadBasicsRunner {

	// NEW
	// RUNNABLE
	// RUNNING
	// BLOCKED/WAITING
	// TERMINATED/DEAD
	public static void main(String[] args) throws InterruptedException {

		//Task1
		/*for(int i=101; i<=199; i++) {
			System.out.print(i+" ");
		}
		System.out.println("Task1 Done");
		*/
		Task1 task1 = new Task1(); //NEW STATE
		task1.setPriority(10);
		task1.start();
		
		Task2 task2 = new Task2();
		Thread task2thread = new Thread(task2); //NEW STATE
		task2thread.start();
		
		//Task3 starts only after task1 is done - wait for task1 to complete
		task1.join();
		task2thread.join();
		
		task1.sleep(10000);
		task2thread.yield();
		//Task2
		/*for(int i=201; i<=299; i++) {
			System.out.print(i+" ");
		}
		System.out.println("Task2 Done");
		*/
		//Task3
		for(int i=301; i<=399; i++) {
			System.out.print(i+" ");
		}
		System.out.println("Task3 Done");
		
		System.out.println("Main Done");
		
		//Two ways - 
		//extends Thread
		//implements Runnable
		
	}

}
