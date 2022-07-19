package parallelSort;

import java.util.Arrays;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
	    
		char [] charArr = str.toCharArray();
		Arrays.parallelSort(charArr);
		
		
		String strOutput = "";
		for(char c : charArr) {
			strOutput = strOutput+c;
		}
		
		System.out.println(strOutput);
		sc.close();

	}

}
