import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamExample2 {

	public static void main(String[] args) {
		Student student = new Student();
		student.setStudentId(2);
		student.setStudentName("ABC");
		student.setMobileNumber("1234567890");
		student.setEmail("ABC@gmail.com");

		Student student1 = new Student(1, "XYZ", "1234512345", "ghg@gmail.com");

		List<Student> list = new ArrayList<>();
		list.add(student);
		list.add(student1);
		
		list.stream().sorted(Comparator.comparing(Student::getStudentName)).forEach(x -> System.out.println(x));
		
	}
}
