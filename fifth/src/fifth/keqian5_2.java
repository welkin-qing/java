package fifth;

import java.util.Scanner;

public class keqian5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []score = new int [n];
		for(int i=0; i<n; i++) {
			int num = sc.nextInt();
			if(num<=100 && num>0) {
				score[i] = num;
			}else {
				System.out.println(num+"invalid!");
			}
		}
		int a=0,b=0;
		for(int i=0; i<score.length;i++) {
			if(score[i]>=60) {
				a=a+1;
			}else {
				b=b+1;
			}
		}
		System.out.println(a);
		System.out.println(b);
	}

}
