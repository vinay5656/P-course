package forEachMethod;

import java.util.ArrayList;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> weekdays = new  ArrayList<String>();
		weekdays.add("Monday");
		weekdays.add("Tuesday");
		weekdays.add("Wednesday");
		weekdays.add("Thursday");
		weekdays.add("Friday");
		weekdays.add("Saturday");
		weekdays.add("Sunday");
		
		weekdays.forEach((weekday)->System.out.print(weekday+" "));

	}

}
