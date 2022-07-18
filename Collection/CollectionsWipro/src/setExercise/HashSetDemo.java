package setExercise;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo{
	public static HashSet<String> set = new HashSet<String>();
	
	public static boolean addCountry(String countryName) {
		if(set.contains(countryName)) {
			return false;
		}else {
	       return set.add(countryName);
		}  
	}
	public static String findCountry(String countryName) {
		System.out.println("findCountry--------");
		if(set.contains(countryName)) {
			return "Yes, "+countryName+" is Persent.";
		}else {
			return "Country Not Found.";
		}
		
	}
   static void  printAllCountries() {
	   System.out.println("Printing the set element------");
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	public static void main(String [] args) {
		addCountry("India");
		addCountry("USA");
		addCountry("Australia");
		addCountry("France");
		addCountry("Germany");
		printAllCountries();
		
		System.out.println(findCountry("UK"));
		System.out.println(findCountry("India"));
		
		
	}
	
}


