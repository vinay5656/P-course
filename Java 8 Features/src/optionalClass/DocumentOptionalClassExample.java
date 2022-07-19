package optionalClass;

import java.util.Optional;

/*
 * Option Class:-
 * 1.It is a final class.
 * 2.I helps in writing neat and more readable code without using to many null check
 * 3.Optional intance: A container object which may or may not contain a non-null value.
 * 4.By using Optional instance, we can specify alternate values to return or alternate code to run
 * */

/* 
 * Get Method:-
 * It simply return the object from the optional instance.
 * In the case, No null check is done and the optional instance return the contained value as it is
 * 
 * 
 * Returns an Optional instance with a present value
 * if the specified value is not null.
 * Otherwise an empty optional instance
 * */

/*
 * orElseThrow() Method :-
 * Return the object value if the object is not null.
 * and if the object is null it throws the specified exception
 * 
 * */

/*
 * orElse() Method:-
 * Get if Object is not Null, else return default value using orElse() method
 * */

/*
 * isPresent() method:-
 * Check if it is not Null using isPresent() method.
 * it returns true is the contained value is not null*/

public class DocumentOptionalClassExample {
//      String name = "Admin"; // Case 1. When object contain the value
	  String name;//            Case 2. When object don't contain the value.
	  
	  String default_name = "User";// Add it with orElse method else keep it in comment
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DocumentOptionalClassExample obj = new DocumentOptionalClassExample();
		Optional<String> n = Optional.ofNullable(obj.name);
//		System.out.println(n.get());
//		System.out.println(n.orElseThrow(NullPointerException::new));
//		System.out.println(n);// print the Optional instance to what value it contain
//		System.out.println(n.orElse(obj.default_name));
		if(n.isPresent()) {
			System.out.println(n.get());
		}else {
			System.out.println("Null Value");
		}
		

	}

}
