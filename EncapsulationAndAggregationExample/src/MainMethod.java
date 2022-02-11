
public class MainMethod {

	public static void main(String[] args) {

		Address address = new Address();
		address.setAddressId(1);
		address.setPlotNo("12");
		address.setLocality("DGH");
		address.setCity("HJDH");
		address.setState("hds");
		address.setCountry("cbus");

		Student student = new Student();
		student.setStudentId(1);
		student.setStudentName("ABC");
		student.setMobileNumber("1234567890");
		student.setEmail("ABC@gmail.com");
		student.setAddress(address);

		System.out.println(student);
		int result = student.getStudentId();
		System.out.println(result);
		System.out.println(student.getStudentName());
		System.out.println(student.getAddress());

		Student student1 = new Student(1, "XYZ", "1234512345", "ghg@gmail.com",
				new Address(1, "13", "fsds", "dsds", "fds", "fss"));
		System.out.println(student1);
	}

}
