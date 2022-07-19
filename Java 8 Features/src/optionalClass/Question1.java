package optionalClass;

import java.util.Optional;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[] = new String[5];
		Optional<String> n = Optional.ofNullable(names[0]);
//		System.out.println(names[0].length());
	    if(n.isPresent()) {
	    	System.out.println(names[0].length());
	    }else {
	    	System.out.println("String is not present");
	    }
		

	}

}
