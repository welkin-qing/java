package hello;

import java.util.Scanner;

public class keqian3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int []num = new int [n];
		for(int i=0;i<num.length;i++) {
			int z = in.nextInt();
			num[i] = z;
		}
		
		int t;
		for(int i=0;i<num.length;i++) {
			for(int j=i;j<num.length;j++) {
				if(num[i]<num[j]) {
					t = num[i];
					num[i] = num[j];
					num[j] = t;
				}
			}
		}
		//java.util.Arrays.sort(num);
		for(int i=0;i<num.length-1;i++) {
			System.out.print(num[i]+ " ");
		}
		System.out.print(num[num.length-1]);
	}

}
