package hello;

import java.util.Scanner;

public class ketang3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String []num = new String[n];
		for(int i=0; i<n; i++) {
			String z = in.next();
			num[i] = z;
		}
		for(int i=0;i<n;i++) {
			System.out.println(num[i]);
		}
		System.out.println("------");
		java.util.Arrays.sort(num);
		for(int i=0;i<n;i++) {
			System.out.println(num[i]);
		}

	}

}
