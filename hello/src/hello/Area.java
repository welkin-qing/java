package hello;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner number = new Scanner(System.in);
		double r = number.nextDouble();
		System.out.printf("%.4f", (r*r*(Math.sqrt(25+10*Math.sqrt(5)))/4));
		System.out.printf("\n");
		System.out.printf("%.0f", 5*r);
		
	}

}
