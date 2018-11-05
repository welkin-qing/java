package third;

import java.util.Scanner;

public class third2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str = in.next();
		char []num = str.toCharArray();
		int sum = 0;
		String result = "";
		for(int i=0; i<str.length();i++) {
			if(num[i]>=65 && num[i]<=90) {
				sum++;
				result += num[i];
			}
		}
		System.out.println("大写字母有："+sum);
		System.out.println("分别为：" + result);
	}

}
