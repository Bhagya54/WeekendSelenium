package day3;

public class LoopsDemo {

	/*
	 * for
	 * while
	 * do while
	 * 
	 * values 1 to 10
	 * 1 2 3
	 * i = 10
	 * i++ == 11
	 * i=i+2 == 
	 * 
	 * i-- =9 8...
	 * 10 9 8.. 1
	 * 
	 * 5 10 15 20 25 30
	 * 30.. .5
	 */
	
	

	
	public static void main(String[] args) {
		System.out.println("For loop from 10 to 5");
		for(int i=5;i<=30;i=i+5) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Reverse for loop from 10 to 5");
		for(int i=30;i>=5;i=i-5) {
			System.out.print(i + " ");
		}
		
		
		System.out.println();
		System.out.println("Learning while loop");
		
		int i=11;
		while(i<=10) {
			System.out.print(i + " ");
			i++;
		}
		
		System.out.println("Do While loop executes atleast once");
		do {
			System.out.print(i + " "); // 11
			i++; //12
		}while(i<=10);
		
	}

}
