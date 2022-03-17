package Section14;

import java.util.ArrayList;

public class Book {
	private int id;
	private String bookName;
	private String authorName;
	
	private ArrayList<Review> reviews = new ArrayList<>();
	
	//creation
	public Book(int id, String name, String author) {
		this.id = id;
		this.bookName = name;
		this.authorName = author;
		
	}

	public void addReview(Review review) {
		this.reviews.add(review);
	}
	
	//toString Overriding
	public String toString() {
		return String.format("id = %d name = %s author = %s Reviews = [%s]",
				id, bookName, authorName, reviews);
	}

}
