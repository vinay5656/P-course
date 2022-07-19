package ioOperations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input file name:");
		String inputFileName = sc.nextLine();
		System.out.println("Enter the output file name:");
		String outputFileName = sc.nextLine();
		
		File inputfile = new File(inputFileName);
		File outputfile = new File(outputFileName);
		
		BufferedWriter bw = null;
	
		BufferedReader br = null;
		try {
			FileReader fr = new FileReader(inputfile);
			FileWriter fw = new FileWriter(outputfile);
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			
		    String line;
		
		    while((line = br.readLine())!= null) {
		    	bw.write(line+"\n");
		    }
		    System.out.println("File is copied");
		}catch(Exception e) {
			System.out.println(e.toString());
		}finally {
			try {
				br.close();
				bw.close();
			}catch(Exception e) {
				System.out.println(e.toString());
			}
		}
		
		sc.close();

	}

}
