package hello;

import java.util.Scanner;

public class judge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("���������");
		int score = s.nextInt();
		if(score>=60) {
			System.out.println(score+"����");
		}else {
			System.out.println("������");
		}
	}

}
