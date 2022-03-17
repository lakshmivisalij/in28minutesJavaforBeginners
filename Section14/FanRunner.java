package Section14;

public class FanRunner {

	public static void main(String[] args) {
		
		Fan fan = new Fan("Bajaj", 14.5, "Ivory");
		System.out.println(fan);
		fan.switchOn();
		System.out.println(fan);
		fan.setSpeed((byte)3);
		System.out.println(fan);
		fan.switchOff();
		System.out.println(fan);
		
	}

}
