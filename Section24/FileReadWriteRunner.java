package Section24;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadWriteRunner {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("./resources/title.txt");
		String fileContent = Files.readString(path);
		System.out.println(fileContent);
		
		String newFileContent = fileContent.replace("Line","Liness");
		
		Path newFilePath = Paths.get("./resources/title_replaced.txt");
		Files.writeString(newFilePath, newFileContent);
	}

}
