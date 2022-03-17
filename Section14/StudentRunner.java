package Section14;

public class StudentRunner {

	public static void main(String[] args) {
		Student student = new Student();
		student.setName("Visali");
		student.setEmail("visali@email.com");
		student.setYear(2022);
		
		Person person = new Person();
		String value = person.toString();
		
		System.out.println(value);
		System.out.println(person);

	}

}
