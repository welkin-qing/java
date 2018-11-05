package third;

import java.util.Scanner;

class 	QuadraticEquation{
	private double a,b,c;
	public QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
	public double getRoot1() {
		double x = (-b + Math.sqrt(b*b-4*a*c))/2*a;
		return x;
	}
	public double getRoot2() {
		double y = (-b - Math.sqrt(b*b-4*a*c))/2*a;
		return y;
	}
	/*public double jisuan() {
		double num = b*b - a*c*4;
		if(num > 0) {
			
		}
	}*/
}
public class third2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("请输入a，b，c：");
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		QuadraticEquation s = new QuadraticEquation(a, b, c);
		double sum = s.getB()*s.getB() - 4*s.getA()*s.getC();
		if(sum > 0) {
			System.out.println("root1="+ s.getRoot1()+" root2="+s.getRoot2());	
		}
		if(sum == 0){
			System.out.println("root1=root2="+s.getRoot2());
		}
		if(sum < 0) {
			System.out.println("此方程无解");
		}
		
	}

}
