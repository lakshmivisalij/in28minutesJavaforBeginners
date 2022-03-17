package section8;

public class MotorBikeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotorBike ducati = new MotorBike();
		MotorBike yamaha = new MotorBike();
		
		//Start Bike
		ducati.start();
		yamaha.start();
		
		//Setter Method
		ducati.setSpeed(-100);
		yamaha.setSpeed(80);
		
		//Getter Method
		System.out.println(ducati.getSpeed());
		System.out.println(yamaha.getSpeed());
		
		
	}

}
