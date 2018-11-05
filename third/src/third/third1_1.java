package third;

import java.sql.Date;
import java.text.SimpleDateFormat;

//SimpleDateFormat
public class third1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat myFmt = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
		SimpleDateFormat myFmt1 = new SimpleDateFormat("yy/MM/dd HH:mm");
		SimpleDateFormat myFmt2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 等价于now.toLocaleString()
		SimpleDateFormat myFmt3 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 E ");
		SimpleDateFormat myFmt4 = new SimpleDateFormat("一年中的第 D 天 一年中第w个星期 一月中第W个星期 在一天中k时 z时区");
		Date now = new Date(0);//当前时间
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
