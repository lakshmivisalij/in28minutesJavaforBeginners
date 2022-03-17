package Section20;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths; //introduced in Java7 - nio=> new io
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DirectoryScanRunner {

	public static void main(String[] args) throws IOException {
		Files.list(Paths.get("."))
		.forEach(System.out::println);
		
		Path currDirectory = Paths.get(".");
		Predicate<? super Path> predicate = path -> String.valueOf(path).contains(".java");

		
		//Files.list(currDirectory).forEach(System.out::println);
		//walk through a curr direc with 2 level deeper
		Files.walk(currDirectory, 3).filter(predicate).forEach(System.out::println);

		BiPredicate<Path, BasicFileAttributes> matcher = (path, attributes) -> String.valueOf(path).contains(".java");
		
		BiPredicate<Path, BasicFileAttributes> directoryMatcher 
		= (path, attributes) -> attributes.isDirectory();
		
		Files.find(currDirectory, 4, directoryMatcher)
		.forEach(System.out::println);;
		
	
	}
}
