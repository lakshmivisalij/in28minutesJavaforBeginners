package Section20;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths; //introduced in Java7 - nio=> new io
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class FileReadRuner {

	public static void main(String[] args) throws IOException {
		
		Path pathFileToRead = Paths.get("./res/data.txt");
		
	//	List<String> lines = Files.readAllLines(pathFileToRead);
		//System.out.println(lines);
		
		Files.lines(pathFileToRead)
		.forEach(System.out::println);
		
		Files.lines(pathFileToRead)
		.map(String::toLowerCase)
		.filter(str -> str.contains("a"))
		.forEach(System.out::println);
	
	}
}
