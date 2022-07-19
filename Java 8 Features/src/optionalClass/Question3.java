package optionalClass;

import java.util.Optional;

class Worker{
	public String name;

//	/**
//	 * @param name
//	 */
//	public Worker(String name) {
//		this.name = name;
//	}
	
} 

class InvalidEmployeeException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	InvalidEmployeeException(String s){
		super(s);
	}
}

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worker emp = new Worker();
		emp = null;
		Optional<Worker> n = Optional.ofNullable(emp);
		try {
			System.out.println(n.orElseThrow(() -> new InvalidEmployeeException("InvalidEmployeeException has occured")));
		} catch (InvalidEmployeeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
