package day3;

public class BreakContinueDemo {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i==5) {
				//break;//stop
				continue; //skip 1 2 3 4 6 7 8 9 10
			}
			System.out.println(i);
		}
		
		System.out.println("Out of Loop");

	}

}
