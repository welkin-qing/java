package third;

import java.sql.Date;
import java.text.SimpleDateFormat;

//SimpleDateFormat
public class third1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat myFmt = new SimpleDateFormat("yyyy��MM��dd�� HHʱmm��ss��");
		SimpleDateFormat myFmt1 = new SimpleDateFormat("yy/MM/dd HH:mm");
		SimpleDateFormat myFmt2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// �ȼ���now.toLocaleString()
		SimpleDateFormat myFmt3 = new SimpleDateFormat("yyyy��MM��dd�� HHʱmm��ss�� E ");
		SimpleDateFormat myFmt4 = new SimpleDateFormat("һ���еĵ� D �� һ���е�w������ һ���е�W������ ��һ����kʱ zʱ��");
		Date now = new Date(0);//��ǰʱ��
		System.out.println(myFmt.format(now));
		System.out.println(myFmt1.format(now));
		System.out.println(myFmt2.format(now));
		System.out.println(myFmt3.format(now));
		System.out.println(myFmt4.format(now));
		System.out.println(now.toGMTString());//The method toGMTString() from the type Date is deprecated.
		System.out.println(now.toLocaleString());
		System.out.println(now.toString());

	}

}
