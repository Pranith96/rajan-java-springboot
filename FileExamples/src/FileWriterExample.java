import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) throws IOException {
		FileWriter fileWriter = new FileWriter("C:\\Users\\ramannpr\\support_works\\rajan-java-springboot\\index1.txt");
		fileWriter.write("Hello world");
		fileWriter.close();
		System.out.println("Success file saved");
	}
}
