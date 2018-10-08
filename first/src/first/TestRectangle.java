package first;

import java.util.Scanner;

class Rectangle{
	private int  width;
	private int  height;
	public void setwidth(int W) {
		width = W;
	}
	public void setHeight(int h) {
		height = h;
	}
	public int getArea( ) {
		return width*height;
	}
	public int getPerimeter( ) {
		return 2*(width+height);
	}
	public int getwidth( ) {
		return width;
	}
	public int getHeight( ) {
		return height;
	}
	

}

public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int w = in.nextInt();
		int h = in.nextInt();
		Rectangle test= new Rectangle();
		test.setHeight(h);
		test.setwidth(w);
		System.out.println("长为"+test.getHeight());
		System.out.println("宽为"+test.getwidth());
		System.out.println("周长为"+test.getPerimeter());
		System.out.println("面积为"+test.getArea());
	}

	
}
