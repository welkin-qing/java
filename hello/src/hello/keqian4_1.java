package hello;
import java.util.Scanner;
import java.text.DecimalFormat;
abstract class shape {// ������
    /* ���󷽷� ����� */
   public abstract double getArea( );

   /* ���󷽷� ���ܳ� */
   public abstract double getPerimeter( );
};
class Circle extends shape{
	private double r;
	public Circle(double r) {
		this.r = r;
	}
	public double getArea() {
		return r*r*Math.PI;
	}
	public double getPerimeter() {
		return Math.PI*2*r;
	}
}
public class keqian4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
	        DecimalFormat d = new DecimalFormat("#.####");// ����4λС��
	         double r = input.nextDouble( ); 
	         shape c = new Circle(r);

	         System.out.println(d.format(c.getArea()));
	         System.out.println(d.format(c.getPerimeter()));
	         input.close();

	}

}
