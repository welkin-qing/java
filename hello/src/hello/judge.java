package hello;

import java.util.Scanner;

public class judge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("输入分数：");
		int score = s.nextInt();
		if(score>=60) {
			System.out.println(score+"及格");
		}else {
			System.out.println("不及格");
		}
	}

}
