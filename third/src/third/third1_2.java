package third;

import java.sql.Date;
import java.text.DateFormat;
import java.util.GregorianCalendar;

public class third1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL);
		// Create our Gregorian Calendar.
		GregorianCalendar cal = new GregorianCalendar();
		// Set the date and time of our calendar
		// to the system´s date and time
		cal.setTime(new Date(0));
		System.out.println("System Date: " + dateFormat.format(cal.getTime()));
		// Set the day of week to FRIDAY
		cal.set(GregorianCalendar.DAY_OF_WEEK, GregorianCalendar.FRIDAY);
		System.out.println("After Setting Day of Week to Friday: " + dateFormat.format(cal.getTime()));
		int friday13Counter = 0;
		while (friday13Counter <= 10) {
			// Go to the next Friday by adding 7 days.
			cal.add(GregorianCalendar.DAY_OF_MONTH, 7);
			// If the day of month is 13 we have
			// another Friday the 13th.
			if (cal.get(GregorianCalendar.DAY_OF_MONTH) == 13) {
				friday13Counter++;
				System.out.println(dateFormat.format(cal.getTime()));
			}
		}

	}

}
