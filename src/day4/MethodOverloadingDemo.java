package day4;

public class MethodOverloadingDemo {

	/*
	 * public char add() { System.out.println("Hi"); return 'a'; }
	 * 
	 * public boolean demo() { return false; }
	 * 
	 * public int sum() { int a = 10; int b = 20; int c = a + b; return c; }
	 */
	
	/*
	 * Same Method Name
	 * 1. different no. of parameters
	 * 2. same number of parameters but different datatype
	 */

	public int sum(int a,int b) {
		
		return a+b;
	}
	public float sum(float a,float b) {
		return a+b;
	}
	
	public void sum(int a,int b,int c) {
		System.out.println("Adding 3 integer values: " +(a+b+c));
	}
	public static void main(String[] args) {
		MethodOverloadingDemo m = new MethodOverloadingDemo();
		m.sum(23, 34,45);
		
		System.out.println("Adding 2 integer values: " + m.sum(23, 34));
		System.out.println("Adding 2 float values: " + m.sum(22.32f,45.78f));
		
	}

}
