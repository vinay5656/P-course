package setExercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//import java.util.TreeSet;

class EmployeeSalaryComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		if(emp1.getSalary()>emp2.getSalary()) {
			return 1;
		}else if(emp1.getSalary()<emp2.getSalary()) {
			return -1;
		}
		return 0;
	}

	
}

class Employee{
	public int empID;
	public String name;
	public float salary;
	/**
	 * @param empID
	 * @param name
	 * @param salary
	 */
	public Employee(int empID, String name, float salary) {
		this.empID = empID;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	/**
	 * @return the salary
	 */
	public float getSalary() {
		return salary;
	}
	
	
	
}

public class TreeSetDemo {
	public static ArrayList<Employee> set = new ArrayList<Employee>();
	public static boolean addEmployee(Employee emp) {
		return set.add(emp);
	}
	public static void displayAllEmployee() {
		for(Employee emp: set) {
			System.out.println(emp);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TreeSet<Employee> set = new TreeSet<Employee>();
		Employee emp1 = new Employee(23,"Vinay",30000);
		Employee emp2 = new Employee(24,"Ravi",3000);
		Employee emp3 = new Employee(25,"Bhavesh",30500);
		Employee emp4 = new Employee(26,"Anmol",30023);
		Employee emp5 = new Employee(27,"Loki",300003);
		addEmployee(emp1);
		addEmployee(emp2);
		addEmployee(emp3);
		addEmployee(emp4);
		addEmployee(emp5);
		displayAllEmployee();
		
		Collections.sort(set,new EmployeeSalaryComparator());
		
		System.out.println("After sort ....");
		displayAllEmployee();
		

	}

}
