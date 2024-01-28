package day2;

public class DataTypeConversion {
	
	/*
	 * B1: 3l
	 * B2: 5l -- 2l
	 * 
	 * Task 1: B1 -- > B2. -- possible
	 * Task2 : B2--- > B1 -- chances of data loss,
	 * confirmation --
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		byte b2 = 67;
		int i2 = b2;
		System.out.println(b2);
		System.out.println(i2);
		
		int i1 = 45;
		byte b1 = (byte) i1;//-128 to 127
		System.out.println(i1);
		System.out.println(b1);
		
		float f1 = 56.87f;
		int i3 = (int) f1;
		System.out.println(f1);
		System.out.println(i3);
		
		int i4 = 56;
		float f2 = i4;
		
		System.out.println(i4);
		System.out.println(f2);
		
		char c1 = 'y';
		int i5 = c1;
		System.out.println(c1);
		System.out.println(i5);
		
		
		int i6 = 120;
		char c2 = (char) i6;
		System.out.println(i6);
		System.out.println(c2);
		
		
		/*Wrapper Class
		 * int: Integer
		 * char: Character
		 * float: Float
		 * 
		 * 
		 */
		String s1 = "123";
		int i7 = Integer.parseInt(s1);
		float f3 = Float.parseFloat("56.90");
		
		System.out.println("s1 value is: " +s1);
		System.out.println(i7);
		System.out.println(f3);
		
		
		int i8 = 568;
		String s2 = Integer.toString(67);
		System.out.println(i8);
		System.out.println(s2);
		
		
		
		
	}

}
