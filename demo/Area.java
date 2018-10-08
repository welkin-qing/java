//package 计算正五边形的面积和周长;

import java.util.Scanner;

public class Area {

	public Area() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		double r=in.nextDouble();
		System.out.printf("%.4f",(r*r*(Math.sqrt(25+10*Math.sqrt(5)))/4));
		System.out.printf("\n");
		System.out.printf("%.0f",5*r);
	}
}
