package day9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		String filePath = "C:\\Users\\91733\\OneDrive\\Desktop\\Weekend Selenium\\WeekendSelenium_Java Basics\\src\\day9\\testData";
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		System.out.println(br.readLine());
		
		String st = null;
		
		while((st=br.readLine())!= null) {
			System.out.println(st);
		}
		
		
	}

}
