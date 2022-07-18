package mapExercise;

public class TestExersice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContactList contactList = new ContactList();
		
		// Adding item to contact list
		System.out.println("Add.......");
		contactList.addEntry("Vinay", 1021409041);
		contactList.addEntry("Bhavesh", 1021429040);
		contactList.addEntry("Ujjwal", 1021429040);
		contactList.addEntry("Ravi", 1021439040);
		contactList.addEntry("Loki", 1021449040);
		contactList.addEntry("Perteek", 1022419041);
		contactList.addEntry("Shray", 1021469040);
		
		//Get phone number using contact holder
		System.out.println("Phone Number.......");
		System.out.println(contactList.getPhoneNumber("Ravi"));
		
		//Get contact name using phone number
		System.out.println("Contact holder .......");
		System.out.println(contactList.getContactHolder(1021449040));
		
		//Display items
		System.out.println("Display item.........");
		contactList.displayEntries();

	}

}
