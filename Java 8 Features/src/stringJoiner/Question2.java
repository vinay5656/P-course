package stringJoiner;

import java.util.StringJoiner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringJoiner s1 = new StringJoiner(",","(",")");
		s1.add("Jaipur");
		s1.add("Ajmer");
		s1.add("Alwar");
		StringJoiner s2 = new StringJoiner(",","(",")");
		s2.add("Dehli");
		s2.add("Punjab");
		s2.add("Haryana");
		
		System.out.println("s1 : "+s1);
		System.out.println("s2 : "+s2);
		
		s1.merge(s2);
		System.out.println("s1 : "+s1);
		s2.merge(s1);
		System.out.println("s2 : "+s2);
		

	}

}
