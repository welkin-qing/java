package welkin;

import java.util.Scanner;

public class qian3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num[] = new int [n];
		for(int i=0; i<n; i++) {
			int z = sc.nextInt();
			num[i] = z;
		}
		java.util.Arrays.sort(num);
		for(int i=0; i<num.length; i++) {
			System.out.printf(num[i]+ " ");
		}
	}

}
