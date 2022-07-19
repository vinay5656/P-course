package dateAPI;

import java.time.LocalTime;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime currentTime = LocalTime.now();
		System.out.println(currentTime);
		System.out.println(currentTime.minusHours(5).minusMinutes(30));

	}

}
