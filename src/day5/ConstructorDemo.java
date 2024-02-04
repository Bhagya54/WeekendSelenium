package day5;

public class ConstructorDemo {
// Constructor - 
	//forces the user to initialize the variable
	//Non-parameterized
	
	// java will create automatically a default constructor
	
	public ConstructorDemo() {
		System.out.println("Inside Constructor");
	}
	
	
	
	public void demo() {
		System.out.println("Demo");
	}
	public static void main(String[] args) {
		Student s1 = new Student(123,"xyz","rte232c");
		System.out.println(s1.id + " " + s1.name);

		Student s2 = new Student(345,"qwe");
		System.out.println(s2.id + " " + s2.name);
		
		ConstructorDemo demo =new ConstructorDemo();
		demo.demo();
	}

}
