package third;

import java.util.Arrays;

public class third2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "hihdihiodtuikio";

		String s = sort(str);

		System.out.println(s);
	}

	private static String sort(String str) {
		// TODO Auto-generated method stub
		char[] chs = StringToCharArray(str);
		charSort(chs);
		String s = new String(chs);
		return s;
		
	}

	private static void charSort(char[] chs) {
		// TODO Auto-generated method stub
		Arrays.sort(chs);
	}

	private static char[] StringToCharArray(String str) {
		// TODO Auto-generated method stub
		return str.toCharArray();
	}

}
