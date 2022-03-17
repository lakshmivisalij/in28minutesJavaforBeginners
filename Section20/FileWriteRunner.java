package Section20;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriteRunner {

	public static void main(String[] args) throws IOException {
		Path pathFileToWrite = Paths.get("./resources/filewrite.txt");
		
		List<String> list = List.of("APple", "boy", "cat");
		
		Files.write(pathFileToWrite, list);
		

	}

}
