package Section21;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {

	int i = 0;
	int j = 0;
	
	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();
	public void incrementI() {
		
		lockForI.lock();//Get Lock
		i++;
		lockForI.unlock();//Release Lock for i
	}
	
   public void incrementJ() {		

	lockForJ.lock();//Get Lock
	j++;
	lockForJ.unlock();//Release Lock for j
	}
	public int getI() {
		return i;
	}
	public int getJ() {
		return j;
	}

}
