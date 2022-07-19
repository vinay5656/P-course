package optionalClass;

import java.util.Optional;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String name = null;
		String name = "Vinay";
		String defaultValue = "India";
		Optional<String> n = Optional.ofNullable(name);
//		System.out.println(names[0].length());
	    System.out.println(n.orElse(defaultValue));
	
	}

}
