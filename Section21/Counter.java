package Section21;

public class Counter {

	int i =0;
	
	synchronized public void increment() {
		
		//get i;
		//increment
		//set i
		i++;
	}
	public int getI() {
		return i;
	}
}
