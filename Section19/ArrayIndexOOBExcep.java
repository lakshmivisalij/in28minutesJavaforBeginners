package Section19;

public class ArrayIndexOOBExcep {
	
public static void main(String[] args) {
		
		method1();
		System.out.println("Main Ended");

	}

	private static void method1() {
		method2();
		System.out.println("M1 ended");
	}
	
	private static void method2() {
		try {
			int[] i = {1,2};
			int number = i[3];
			System.out.println("M2 ended");
		} 
		
		catch (NullPointerException ex) {
			System.out.println("NullPOinter Exception Occured!");
			ex.printStackTrace();
		}
		
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Array Index OOBs Exception Occured!");
			ex.printStackTrace();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		} 
	}

}
