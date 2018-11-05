package third;

import java.sql.Date;

public class third2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//用于记录最新的流逝时间
		long t = 10000;
		Date date = new Date(t);
		printDate(t, date);
		t *= 10;
		//通过循环设置新的流逝时间并显示日期
		for(int i=0; i<7; i++) {
			date.setTime(t);
			printDate(t, date);
			t *= 10;
		}
	}

	private static void printDate(long t, Date date) {
		// TODO Auto-generated method stub
		System.out.println(t + ": " + date.toString());
	}

}
