package third;

import java.sql.Date;

public class third2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���ڼ�¼���µ�����ʱ��
		long t = 10000;
		Date date = new Date(t);
		printDate(t, date);
		t *= 10;
		//ͨ��ѭ�������µ�����ʱ�䲢��ʾ����
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
