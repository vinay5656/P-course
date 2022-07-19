package dateAPI;

import java.time.LocalDate;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
		
		System.out.println(today);
		
		System.out.println("Day after 10 days: "+today.plusDays(10));
		System.out.println("Is 2022 is a leap year: "+today.isLeapYear());
		System.out.println("Day before 10 days: "+today.minusDays(6));

	}

}
