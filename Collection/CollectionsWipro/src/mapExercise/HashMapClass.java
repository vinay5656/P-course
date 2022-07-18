package mapExercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

public class HashMapClass {
	//Data member
	private HashMap<String, String> mapObj;
	
	//Constructor
	public HashMapClass() {
		mapObj = new HashMap<String, String>();
	}
    
	//Application Number: 1
	public String saveCountryCapital(String countryName, String capital) {
		return mapObj.put(countryName, capital);
	}

	//Application Number: 2
	public String getCapital(String countryName) {
		if (mapObj.containsKey(countryName)) {
			return mapObj.get(countryName);
		} else {
			return "No Country Found";
		}
	}

	//Application Number: 3
	public String getCountry(String capitalName) {
		if (mapObj.containsValue(capitalName)) {
			for (Entry<String, String> entry : mapObj.entrySet()) {
				if (Objects.equals(entry.getValue(), capitalName)) {
					return entry.getKey();
				}
			}
         }
		return "No Capital Found";
	}
	
	//Application Number: 4
	public HashMap<String,String> reverseKeyWithValue() {
		HashMap<String,String> mapObj2 = new HashMap<>();
		for(Entry<String, String> entry : mapObj.entrySet()) {
			String countryName = entry.getKey();
			String capitalName = entry.getValue();
			mapObj2.put(capitalName, countryName);
		}
		return mapObj2;
	}
	
	//Application Number: 5
	public ArrayList<String> getALLCountry(){
		ArrayList<String> countryList = new ArrayList<String>();
		for(Map.Entry<String, String> entry : mapObj.entrySet()) {
			countryList.add(entry.getKey());
		}
		return countryList;
	}
	
	//Application Number: 6
	public ArrayList<String> getALLCapital(){
		ArrayList<String> capitalList = new ArrayList<String>();
		for(Map.Entry<String, String> entry : mapObj.entrySet()) {
			capitalList.add(entry.getValue());
		}
		return capitalList;
	}
	
	//Application Number: 7
	public void displayMap(){
		for(Map.Entry<String, String> entry : mapObj.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}

}
