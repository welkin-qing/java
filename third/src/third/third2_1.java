package third;

import java.util.Calendar;

public class third2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar myCal = Calendar.getInstance();
		myCal.set(1949, 10, 1);
		long t1949 = myCal.getTimeInMillis();
		myCal.set(2016, 8, 15);
		long t2016 = myCal.getTimeInMillis();
		long day = (t2016 - t1949)/(1000*60*60*24);
		System.out.println("day = "+ day);
	}

}
