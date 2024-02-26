package day9;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {

	/*if we want to read a book
	 * 1. What
	 * 2. Where
	 * 
	 * abc - chinese
	 * FileNotFound - subclass
	 * IOExpection - parent
	 * 
	 */
	public static void main(String[] args) throws IOException {
		
		String filePath = "C:\\Users\\91733\\OneDrive\\Desktop\\Weekend Selenium\\WeekendSelenium_Java Basics\\src\\day9\\testData";
		FileReader fr = new FileReader(filePath);
		//System.out.println((char)fr.read());
		
		int i=0;
		
		while((i=fr.read()) != -1) {
			System.out.print((char)i);
		}
		fr.close();
		
		FileWriter fw = new FileWriter(filePath);
		fw.write("bhagya");
		fw.write("kudupudi");
		fw.close();
	}

}
