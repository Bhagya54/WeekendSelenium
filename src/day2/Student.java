package day2;

public class Student {
	
	int rollno;
	String name;
	String address;
	int grade;
	char section;
	static String schoolName;
	
	
	public void attendSession() {
		int z=10;
		System.out.println("Attend Session");
		System.out.println(z);
		System.out.println(rollno);
		getSchoolName();
	}

	public void submitProject() {
		System.out.println("Submits Project");
		System.out.println(rollno);
		m1();
	}
	
	public static void m1() {
		System.out.println("Welcome");
	}
	
	public static void getSchoolName() {
		System.out.println(schoolName);
	}
	
	public static void main(String[] args) {
		
		// classname ref = new  classname()
		
		Student s1 = new Student();//Instantiation or Object Creation
		s1.rollno = 123;
		s1.name = "Abhilash";
		schoolName = "testing";
		getSchoolName();
		s1.submitProject();
		s1.attendSession();
		
		Student s2 = new Student();
		s2.rollno = 456;
		s2.name = "Bharath";
	
		
		
		System.out.println("Student1 Details:" + s1.rollno + " " +s1.name + " "+ schoolName);
		System.out.println("Student2 Details: " + s2.rollno + " "+ s2.name + " " + schoolName);
	}

}
