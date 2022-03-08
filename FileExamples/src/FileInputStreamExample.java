import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExample {
	
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\ramannpr\\support_works\\rajan-java-springboot\\index.txt");
		int i = fis.read();
		System.out.println((char)i);
		
		int j = 0;
		while((j=fis.read())!=-1) {
			System.out.print((char)j);
		}
		fis.close();
	}

}
