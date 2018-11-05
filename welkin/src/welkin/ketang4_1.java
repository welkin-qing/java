package welkin;

import java.util.Scanner;

abstract class shape {// 抽象类

    /* 抽象方法 求面积 */
    public abstract double getArea();

    /* 抽象方法 求周长 */
    public abstract double getPerimeter();
}
public class ketang4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int a = input.nextInt();
		RegularPolygon o1 = new RegularPolygon(n, a);
		System.out.println(o1.getArea());
		System.out.println(o1.getPerimeter());
	}

}
interface IShape {// 接口
	double getArea(); // 求面积
	double getPerimeter();// 求周长
}
class RegularPolygon implements IShape{
	double n,a;
	RegularPolygon(double n, double a){
		this.n = n;
		this.a = a;
	}
	public double getArea() {
		double h =(a/2)/Math.tan(Math.PI/n);
		return n*a*h/2;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return n*a;
	}
}
