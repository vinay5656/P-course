package objectSerialization;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EmpMainClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sDate1="31/12/1998";  
	    Date date1 = null;
		try {
			date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		Employee emp1 = new Employee("vinay",date1,"dehli","SDE",30000);
		try {
	         FileOutputStream data =
	         new FileOutputStream("C:\\Users\\chauh\\eclipse-workspace\\IO-Operations\\src\\outputFileForQuest3");
	         ObjectOutputStream out = new ObjectOutputStream(data);
	         out.writeObject(emp1);
	         out.close();
	         data.close();
	         System.out.printf("Serialized data is saved in /tmp/employee.ser");
	      } catch (IOException i) {
	         i.printStackTrace();
	      }
		
	}

}
