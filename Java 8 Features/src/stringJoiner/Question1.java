package stringJoiner;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		names.add("Vinay");names.add("Ravi");names.add("Bhavesh");
		
		StringJoiner s1 = new StringJoiner(",","{","}"); 
		
		names.forEach(name -> s1.add(name));
		
		System.out.println(s1);

	}

}
