package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	public int empNo;
	public String name;
	public int age;
	public String location;
	/**
	 * @param empNo
	 * @param name
	 * @param age
	 * @param location
	 */
	public Employee(int empNo, String name, int age, String location) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.age = age;
		this.location = location;
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", name=" + name + ", age=" + age + ", location=" + location + "]";
	}
	
	
	
}

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(101803291,"Vinay",21,"Alwar"));
		empList.add(new Employee(101803292,"Ravi",23,"Pune"));
		empList.add(new Employee(101803293,"Bhavesh",21,"Alwar"));
		empList.add(new Employee(101803294,"Loki",23,"Pune"));
		empList.add(new Employee(101803295,"Ujjwal",24,"Alwar"));
		
		List<Employee> list = empList.stream().filter(emp -> emp.location=="Pune").collect(Collectors.toList());
         
		for(Employee emp : list) {
			System.out.println(emp);
		}
	}

}
