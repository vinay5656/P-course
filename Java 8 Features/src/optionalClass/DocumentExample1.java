package optionalClass;

/*
 * What is NullPointerException?
 * When we try to perform operation on non initialized object or a reference which is not pointing anywhere.
 * Throw the exception which is NullPointerException. 
 * */

class Employee{
	private String name;
	
	public String getName() {
		return name;
	}
}

public class DocumentExample1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		try {
			System.out.println(emp.getName());// emp referencing to uninitialized object
            System.out.println(emp.getName().charAt(0));// performing operation on data member which do not reference any memory
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		

	}

}
