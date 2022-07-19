package ioOperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		String fileName = "C:/Users/chauh/eclipse-workspace/IO-Operations/src/Exercise.txt";
		System.out.println("Enter the file name:");
		String fileName = sc.nextLine();
		System.out.println("Enter the character to the counted: ");
		String whatCharToCount = sc.nextLine();
		
		int count=0;
//		File file = new File("C:\\Users\\chauh\\eclipse-workspace\\JavaProgrammingCourse\\example.txt");
//		File file = new File("C:\\Users\\chauh\\eclipse-workspace\\IO-Operations\\src\\Exercise.txt");
		File file = new File(fileName);
		BufferedReader br = null;
		try {
			FileReader fr = new FileReader(file);
		    br = new BufferedReader(fr);
			
		    String line;
		    while((line = br.readLine())!= null) {
		    	int originalLength = line.length();
//		    	System.out.println("o:"+originalLength);
				line.toLowerCase();
				String replacedLine = line.replaceAll(whatCharToCount, "");
				int newLength = replacedLine.length();
//				System.out.println("n:"+newLength);
				count = count+(originalLength-newLength);
//				System.out.println("c:"+count);
		    }
		    
		    System.out.printf(whatCharToCount+" is persent "+count+" number time.");
		}catch(Exception e) {
			System.out.println(e.toString());
		}finally {
			try {
				br.close();
			}catch(Exception e) {
				System.out.println(e.toString());
			}
		}
		sc.close();
	}

}
