package Section13;

import java.math.BigDecimal;

public class StudentRunner {
	public static void main(String[] args) {
		int[] marks = {97,98,100};
		Student student = new Student("Visali", marks);
		
		//Student student1 = new Student("Jay",  98,98);
		
		Student student2 = new Student("Adi", 97);
		
		int number = student.getNumberofMarks();
		System.out.println("number of marks: "+number);
		
		int total = student.getTotalSumofMarks();
		System.out.println("Total of marks: " + total);
		
		int maxi = student.getMaxMark();
		System.out.println("Max maxk: "+maxi);
		
		int mini = student.getMinMark();
		System.out.println("Min Mark: "+ mini);
		
		BigDecimal average = student.getAvgMark();
		System.out.println("Average of Marks: "+average);
		
		System.out.println(student);
		
		//USAGE of ArrayList
		student.addNewMark(98);
		System.out.println(student);
		//remove from index 3
		student.removeMark(3);
		System.out.println(student);
		student.print(1);
		student.print(1,2,3);
		
	}

}
