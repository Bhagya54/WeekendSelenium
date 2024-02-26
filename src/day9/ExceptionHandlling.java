package day9;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandlling {
/*Exception:
 * unwanted event which may cause interruption to normal flow.
 * 
 * try:any code that is risky
 * catch: handle the exception
 * finally: code gets executed irrespective of an exception being handled or not
 * throws: throwing the exception. We are not handling using try and catch
 * throw: we want to throw our exception
 * java
 * compile -- .class
 * run/execute
 * 
 * compile time
 * runtime
 * 
 * 
 */
	public static void main(String[] args)  {
		String str = null;
	
		int[] a = new int[5];
		String filePath = "C:\\Users\\91733\\OneDrive\\Desktop\\Weekend Selenium\\WeekendSelenium_Java Basics\\src\\day9\\testData";
		try {
			//System.out.println(str.length());
			//int a1 = 5/0;
			System.out.println("Open Connection");
			FileReader fr = new FileReader(filePath);
			System.out.println("File is read");
			
			//System.out.println(a[7]);
			
		} 
		catch (FileNotFoundException e) {
			System.out.println("Please read file from other location");
			
		}
		
		catch (ArithmeticException e) {
			System.out.println("Divide by zero");
		}
		
		catch (NullPointerException e) {
			System.out.println("String is null");
		}
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array size exceeded");
		}
		
		catch(Exception e) {
			System.out.println("some other exception");
		}
		finally {
			System.out.println("Close the connection");
		}
		
		
		try {
			validate(12);
		} catch (IOException e) {
			System.out.println("Please be above 18 years of age to vote");
		}
		
		
		
		

	}

    public static void validate(int age) throws IOException {
    if(age<18) {
    	throw new IOException("You can't vote");
    }
    
    else {
    	System.out.println("You can vote");
    }

	
}

}
