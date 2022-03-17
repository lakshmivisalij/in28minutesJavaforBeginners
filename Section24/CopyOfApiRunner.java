package Section24;

import java.util.ArrayList;
import java.util.List;

public class CopyOfApiRunner {
	public static void main(String[] args) {
		
	
	List<String> names = new ArrayList<String>();
	names.add("Ranga");
	names.add("Ravi");
	names.add("John");
	
	List<String> copyOfNames = List.copyOf(names);
	System.out.println(copyOfNames.toString());
	}
}
