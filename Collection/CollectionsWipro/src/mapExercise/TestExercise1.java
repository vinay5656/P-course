package mapExercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestExercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMapClass map = new HashMapClass();

		// 1. Testing Functionality of saveCountryCapital() function
		map.saveCountryCapital("India", "Dehli");
		map.saveCountryCapital("Japan", "Tokyo");
		map.saveCountryCapital("UK", "London");
		map.saveCountryCapital("India", "Dehli");
		map.saveCountryCapital("Punjab", "Chandigarh");
		map.saveCountryCapital("Haryana", "Chandigarh");
		map.saveCountryCapital("Germany", "Barlin");
		map.saveCountryCapital("Russia", "Moscow");
		map.saveCountryCapital("Ukraine", "Kyiv");
		
        System.out.println("Display.........");
		map.displayMap();

		// 2. Testing functionality of getCapital(countryName) function
		System.out.println("Testing getCapital()........");
		System.out.println(map.getCapital("India"));
		System.out.println(map.getCapital("USA"));

		// 3. Testing Functionality of getCountry() function
		System.out.println("Testing getCountry()........");
		System.out.println(map.getCountry("Tokyo"));
		System.out.println(map.getCountry("Paris"));
         
		// 4. Testing Functionality of reverseKeyWithValue() function
		System.out.println("key:Capital ---- value:Country");
		HashMap<String, String> map2 = map.reverseKeyWithValue();
		for (Map.Entry<String, String> entry : map2.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		// 5. Testing Functionality of getALLCountry() function
		System.out.println("All Countries-----------------");
		ArrayList<String> allCountries = map.getALLCountry();
		for (String country : allCountries) {
			System.out.print(country+"  ");
		}
        System.out.println();
		// 6. Testing Functionality of getALLCapital() function
		System.out.println("All Capitals-----------------");
		ArrayList<String> allCapitals = map.getALLCapital();
		for (String capital : allCapitals) {
			System.out.print(capital+"  ");
		}

	}

}
