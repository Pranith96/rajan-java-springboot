import java.util.ArrayList;
import java.util.List;

public class StudentListExample {

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.setId(1);
		student1.setName("ABC");
		
		Student student2 = new Student(2,"XYZ");
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(new Student(3,"PQR"));
		
		System.out.println(studentList);
		
		for(Student ss : studentList) {
			System.out.println(ss);
			System.out.println(ss.getId());
		}
	}
}
