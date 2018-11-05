package second;

import java.sql.Date;
import java.util.Calendar;

class MyDate{
	private int year;
	private int month;
	private int day;
	
	public MyDate(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public MyDate() {
		Calendar c = Calendar.getInstance();
		year = c.get(Calendar.YEAR);
		month = c.get(Calendar.MONTH) + 1;
		day = c.get(Calendar.DAY_OF_MONTH);
	}
	public MyDate(long time) {
		Date tt = new Date(time);
		Calendar cal = Calendar.getInstance();
		cal.setTime(tt);
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) + 1;
		day = cal.get(Calendar.DAY_OF_MONTH);
	}
	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}
	public void setDate(long elapsedTime) {
		Date tt = new Date(elapsedTime);
		Calendar cal = Calendar.getInstance();
		cal.setTime(tt);
		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH) + 1;
		day = cal.get(Calendar.DAY_OF_MONTH);
	}

	public void printDate() {
		System.out.println("year == " + year);
		System.out.println("month == " + month);
		System.out.println("day == " + day);
	}
}
public class test_date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate t1 = new MyDate();
		t1.printDate();
		System.out.println("*******************");
		MyDate t2 = new MyDate();
		t1.printDate();
	}

}
