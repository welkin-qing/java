package hello;

import java.util.Scanner;

public class test_apple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int y = 0;
		int n = in.nextInt();
		int []num = new int[n];
		for(int i=0;i<num.length;i++) {
				int z = in.nextInt();
				num[i] = z;
		}
		
		int s = in.nextInt();
		for(int i=0;i<num.length;i++) {
			if(num[i] <= s+30) {
				y++;
			}
		}
		System.out.println(y);
		}


}
