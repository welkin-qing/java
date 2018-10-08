package first;
import java.lang.*;
public class test2_1 {
	double x;
	double y;
	double r;
	double area;
	double length;
	double PI=3.14;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test2_1 c = new test2_1();
		c.setR(2);
		c.getArea();
		c.getLength();
		c.setXY(0,0);
	}
	void setXY(double x,double y) {
		this.x=x;
		this.y=y;
	}
	void setR(double r) {
		this.r=r;
	}
	void getArea() {
		area = PI*r*r;
	}
	void getLength() {
		length = 2*test2_1.lang.Math.PI*r;
	}
}
