package day6;

public class ChildClass extends AbstractClass{

	@Override
	public void m2() {
		System.out.println("M2 implemented");
		
	}
	
	public void m1() {
		System.out.println("M1 implemented in child class");
	}

}
