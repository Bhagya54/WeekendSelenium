package day5;

public class Student
{
	int id;
	String name;
	int age;
	String schoolName;
	String grade;
	char section;
	String pancard;
	
	
	//Constructor Overloading
	public Student(int id, String name, int age, String schoolName, String grade, char section, String pancard) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.schoolName = schoolName;
		this.grade = grade;
		this.section = section;
		this.pancard = pancard;
	}

	public Student(int id, String name, String grade, String pancard) {
		
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.pancard = pancard;
	}

	public Student(int id,String name,String pancard) {
		this.id = id;
		this.name = name;
		this.pancard = pancard;
	}
	
	public Student(int a,String n) {
		id = a;
		name = n;	
	}
	
	
	public void attendSession() {
		System.out.println("Student Attending Sessions");
	}
	
	public void submitProject() {
		System.out.println("Student submits project");
	}
	
	
	
}
