package Section15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingStudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		return Integer.compare(s1.getId(), s2.getId());
	}
	
}
public class StudentsCollectionRunner {

	public static void main(String[] args) {
		List<Student> students = List.of(new Student(1, "Ranga"),
				new Student(100, "Adam"),
				new Student(2, "Eve"));
		
		List<Student> studentsAl = new ArrayList<>(students);
		System.out.println(studentsAl);
		
		Collections.sort(studentsAl);
		
		System.out.println("Asc");
		System.out.println(studentsAl);
		
		Collections.sort(studentsAl, new DescendingStudentComparator());
		System.out.println("Asc comparator" + studentsAl);
		
		//studentsAl.sort(new DescendingStudentComparator);
		
		System.out.println();

	}

}
