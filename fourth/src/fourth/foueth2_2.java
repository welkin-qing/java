package fourth;

import java.util.Scanner;

public class foueth2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double side1, side2, side3;
		boolean filled;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入三条边：");
		side1 = input.nextDouble();
		side2 = input.nextDouble();
		side3 = input.nextDouble();
		triangle t = new triangle(side1, side2, side3);
		/*System.out.println("is filled?");
		filled = input.nextBoolean();
		
		if(t.setfilled(filled) == true) {
			input.nextLine();
			System.out.println("请输入颜色：");
			String color = input.nextLine();
			t.setColor(color);
		}*/
		System.out.println(t.toString()+" area="+t.getArea()+" meter="+t.getMeter());
		
	}

}

class triangle extends foueth2_2{
	private double side1 = 1.0, side2 = 1.0, side3 = 1.0;
	String color;
	public triangle(double side1,double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	public double side1() {
		return this.side1;
	}
	public double side2() {
		return this.side2;
	}
	public double side3() {
		return this.side3;
	}
	public double getArea() {
		double s = (side1+side2+side3)*1.0/2;
		double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		return area;
	}
	public double getMeter() {
		return side1+side2+side3;
	}
	public String toString() {
		return "Triangle side1="+ side1 + " side2=" + side2 + " side3=" + side3; 
	}/*
	public boolean setfilled(boolean filled) {
		return filled;
	}
	public void setColor(String color) {
		this.color = color;
	}*/
}


