package mapExercise;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class ContactList {
	private TreeMap<String, Integer> contactList;

	public ContactList() {
		contactList = new TreeMap<String, Integer>();
	}

	public void addEntry(String contactName, Integer contactNumber) {
		contactList.put(contactName, contactNumber);
	}

	// a. Provide contact name and get the phone number

	public int getPhoneNumber(String contactName) {
		return contactList.get(contactName);
	}

	// b. Provide Phone number and get the contact name
	public String getContactHolder(Integer contactNumber) {
		if(contactList.containsValue(contactNumber)) {
			for(Map.Entry<String, Integer> entry : contactList.entrySet()) {
				if (Objects.equals(entry.getValue(), contactNumber)){
					return entry.getKey();
				}
			}
		}

		return "Contact number does not exist.";
	}

	// c. Print all the contact names and their respective phone number

	public void displayEntries() {
		for (Map.Entry<String, Integer> entry : contactList.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

}
