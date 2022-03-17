package Section13;

import java.util.Arrays;

public class MarksArray {

	public static void main(String[] args) {
		int[] marks = new int[5];
		marks[0] = 98;
		marks[1] = 95;
		marks[2] = 91;
		
		int sum=0;
		//Enhanced for loop
		for(int mark:marks) {
		sum += mark;
		System.out.println(mark);
		}
		System.out.println(sum);
		System.out.println(marks.length);
		
		int[] marks1= {56,36,56,89,98};
	
		//declaration = definition
		int[] marks2 = new int[5];
		
		System.out.println(Arrays.toString(marks1));
		
		//Default values - 0,0.0,false, null
		
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks1[i]);
		}
		
		Arrays.fill(marks2, 100);
		System.out.println(marks2[4]);
		
		//comparing arrays - equal or not
		System.out.println(Arrays.equals(marks1, marks2));
	}

}
