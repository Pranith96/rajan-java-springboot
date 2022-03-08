import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamExample {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\ramannpr\\support_works\\rajan-java-springboot\\index.txt");
		FileOutputStream fileOutPutStream = new FileOutputStream(file);
		String s  = "Hello World";
		byte b[] = s.getBytes();
		fileOutPutStream.write(b);
		fileOutPutStream.close();
		System.out.println("Successfully saved");
	}
}
