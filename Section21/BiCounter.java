package Section21;

public class BiCounter {

	int i = 0;
	int j = 0;
	
	synchronized public void incrementI() {
		
		//get i;
		//increment
		//set i
		i++;
	}
	
synchronized public void incrementJ() {
		
		//get j;
		//increment
		//set j
		j++;
	}
	public int getI() {
		return i;
	}
	public int getJ() {
		return j;
	}

}
