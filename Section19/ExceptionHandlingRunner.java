package Section19;

public class ExceptionHandlingRunner {

	public static void main(String[] args) {
		
		method1();
		System.out.println("Main Ended");

	}

	private static void method1() {
		String str = null;
		str.length();
		System.out.println("M1 ended");
	}

}
