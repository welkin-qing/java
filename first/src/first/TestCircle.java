package first;
class Circle{
	private int  radius;
	public Circle()
	{
		radius=10;
	}
	public Circle(int r) {
		radius=r;
	}
	public void setRadius(int r)
	{
		radius=r;
	}
	public double getArea( )
	{
		double  Area=3.14*radius*radius;
		return Area;
	}
	public double getPerimeter( )
	{
		double Perimeter=3.14*2*radius;
		return Perimeter;
	}
	public double getRadius( )
	{
		return radius;
	}

}

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle(11);
		System.out.println("半径为"+c.getRadius( ));
		System.out.println("周长为"+c.getPerimeter());
		System.out.println("面积为"+c.getArea());

	}

}
