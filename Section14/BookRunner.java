package Section14;

public class BookRunner {

	public static void main(String[] args) {
		Book book = new Book(123, "Object Orientend Programming with Java", "Visali");
		
		book.addReview(new Review(10, "Great Book", 5));
		book.addReview(new Review(101, "Awesome", 5));
		
		System.out.println(book);
		
		
	}

}
