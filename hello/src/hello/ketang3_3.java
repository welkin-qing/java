package hello;

import java.util.Scanner;
public class ketang3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int x = in.nextInt();
		int []num = new int [n];
		for(int i=0;i<num.length;i++) {
			int z = in.nextInt();
			num[i] = z;
		}
		int i=0;
		for(i=0; i<num.length;i++) {
			if(x==num[i]) {
				System.out.println(i);return;
			}
		}
		if(i==num.length) {
			System.out.println("Not Found");
		}
	}

}
