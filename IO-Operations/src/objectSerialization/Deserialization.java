package objectSerialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Employee e = null;
			try {
		         FileInputStream fileIn = new FileInputStream("C:\\Users\\chauh\\eclipse-workspace\\IO-Operations\\src\\outputFileForQuest3");
		         ObjectInputStream in = new ObjectInputStream(fileIn);
		         e = (Employee) in.readObject();
		         in.close();
		         fileIn.close();
		      } catch (IOException i) {
		         i.printStackTrace();
		         return;
		      } catch (ClassNotFoundException c) {
		         System.out.println("Employee class not found");
		         c.printStackTrace();
		         return;
		      }
			System.out.println("Deserialized Employee...");
		      System.out.println("Name: " + e.getName());
		      System.out.println("Date: " + e.getDateOfBirth());
		      System.out.println("getDepartment: " + e.getDepartment());
		      System.out.println("getDesignation: " + e.getDesignation());
		      System.out.println("Salary: " + e.getSalary());


	}

}
