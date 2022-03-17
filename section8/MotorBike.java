package section8;

public class MotorBike {
	
	//state
	private int speed;
	
	//Behavior
	void setSpeed(int speed) {
		if(speed>=0) {
		this.speed = speed;
		}
	}
	
	//Behavior
	int getSpeed() {
		return speed;		
	}
	
	void start() {
		System.out.println("Bike Started!");
	}
	
}
