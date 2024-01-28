package day3;

public class ControlStatements {
/*
 * if
 * if else
 * if else if else
 * switch
 */
	public static void main(String[] args) {
		
		int age =7;
		if(age>=18) {
			System.out.println("Allowed to vote");
		}
		else {
			System.out.println("Not allowed to vote");
		}
		
		/*
		 * Perc = 75
		 * 
		 * perc <=75 and >65 --- Distinction
		 * perc <=65 and >40 -- first class
		 * perc <=40 and >20 -- second class
		 *  --- fail
		 * 
		 * 
		 * 
		 */
		int perc = 45;
		if(perc>=75) {
			System.out.println("Distinction");
		}
		
		else if (perc<75 && perc>=65) {
			System.out.println("First class");
		}
		
		else if (perc<65 && perc>=45) {
			System.out.println("Second class");
		}
		else if (perc<45 && perc>=30) {
			System.out.println("Third class");
		}
		else {
			System.out.println("Fail");
		}
		
		int day = 5;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalid input.. Please enter value b/w 1 to 7");
			break;
		}
		

	}

}
