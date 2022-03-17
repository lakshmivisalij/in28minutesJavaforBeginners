package Section13;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Student {

	private String name;
	//private int[] marks;
	//Adding ArrayList
	private ArrayList<Integer> marks = new ArrayList<Integer>();
	
	//Variable argument must be the last argument in the method signature

	//public Student(String name, int[] marks) {
	public Student(String name, int... marks) {
		//ctrl+1 is the shortcut
		this.name = name;
		//this.marks = marks;
		for(int mark:marks) {
		this.marks.add(mark);
		}
	
	}

	public int getNumberofMarks() {
		//return marks.length;
		return marks.size();
	}
	
	public int getTotalSumofMarks()
	{
		
		int sum=0;
		for(int mark:marks) {
			sum+=mark;
		}
		return sum;
		
		
	}
	
	public int getMaxMark() {
		/*
		int max = 0;
		for(int mark:marks) {
			if(mark>max) {
				max = mark;
			}
		}
		return max;
		*/
		return Collections.max(marks);
	}

	public int getMinMark() {
		int min1 = Integer.MAX_VALUE;
		for(int mark:marks) {
			if(mark<min1) {
				min1 = mark;
			}
		}
		return min1;
	}

	public BigDecimal getAvgMark() {
		int sum = getTotalSumofMarks();
		int number = getNumberofMarks();
		
		return new BigDecimal(sum).divide(new BigDecimal(number),3, RoundingMode.UP );
		
	}
	
	//Variable arguments - ...
	void print(int... values) {
		System.out.println(Arrays.toString(values));
	}

	public void addNewMark(int i) {
		// TODO Auto-generated method stub
		marks.add(35);
	}

	public void removeMark(int index) {
		// TODO Auto-generated method stub
		
		marks.remove(index);
		
	}
	
	public String toString() {
		
		return name +" " + marks;
		
	}

}
