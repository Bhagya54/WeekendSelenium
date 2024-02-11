package day6;

public class StringDemo {
/*String is a non-primitive datatype
 * String is class
 * 
 * String Objects are immutible(cannot be change)
 * 
 * 2 ways
 * String literal
 * 	> Objects are created under SCP
 * 	> When the object values are duplicated, it will not create a new object.
 * Reference of it points to same object
 * Using a new Keyword
 * 
 * String Buffer: which is a class which is mutable
 * 
 */
	public static void main(String[] args) {
		String str1 = "selenium";
		System.out.println(str1);
		str1 =str1.concat("java");// seleniumjava
		System.out.println(str1);
		
		System.out.println("Length of a String" + str1.length());//12
		System.out.println("Character at 2nd index" + str1.charAt(2));
		
		System.out.println("Reverse the string");
		for(int i = str1.length()-1;i>=0;i--) {
			System.out.print(str1.charAt(i));
		}
		
		System.out.println();
		String sl1 = "Java";
		String sl2 = "python";
		String sl3 = "Java";
		
		String sn1 = new String("Bhagya");
		String sn2 = new String("Azai");
		String sn3 = new String("Bhagya");
		
		System.out.println(sl1==sl3);
		System.out.println(sn1==sn3);
		
		System.out.println(sn1.equals(sn3));
		
		int a=10;
		int b=20;
		System.out.println(a==b);
		
		
		
		
		System.out.println("Selenium");//Selenium
		System.out.println("Selenium" + 10);//Selenium10
		System.out.println("Selenium" + 10 + 20);//Selenium1020
		System.out.println(10 + "Selenium");//10Selenium
		System.out.println(10+ 20+ "Selenium");//30Selenium
		
		StringBuffer sb1 = new StringBuffer("Tea");
		sb1.append("Coffee"); 
		
		System.out.println(sb1);
		
		System.out.println(sb1.reverse());
		
		
		
	}

}
