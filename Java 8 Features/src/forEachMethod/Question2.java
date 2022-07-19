package forEachMethod;

import java.util.ArrayList;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee(100,"Vinay","ALwar, India",10000);
		Employee emp2 = new Employee(100,"Ravi","Dehradun, India",20000);
		Employee emp3 = new Employee(100,"Loki","Bareilly, India",30000);
		Employee emp4 = new Employee(100,"Kuldeep","Jaipur, India",40000);
		Employee emp5 = new Employee(100,"Mahesh","Sikar, India",50000);
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		
		list.forEach((employee)->{
			System.out.println(employee+" ");//it will give me reference to the object if do not implement toString method	
		});
		
	}

}
