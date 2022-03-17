package Section19;

import java.util.Scanner;

public class FinallyRunner {

	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
		int[] nums = {12,3,4,5};
		
		int num = nums[5];
		
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Before Scanner Close");
			if(scanner!=null) {
			scanner.close();
			}
		}
		System.out.println("Just before closing main");
		

	}

}