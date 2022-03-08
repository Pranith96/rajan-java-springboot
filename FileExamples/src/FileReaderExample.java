import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("C:\\Users\\ramannpr\\support_works\\rajan-java-springboot\\index1.txt");
		int i;
		while((i=reader.read())!=-1) {
			System.out.println((char)i);
		}
		reader.close();
	}
}
