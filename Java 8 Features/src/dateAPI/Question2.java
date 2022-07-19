package dateAPI;

import java.time.LocalDate;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LocalDate date = LocalDate.now();
        LocalDate date2 = date.plusMonths(1).minusWeeks(1);
        System.out.println(date2.getDayOfWeek().plus(1));
	}

}
