package hello;
import java.text.DecimalFormat;
import java.util.Scanner;
abstract class shape {// ������

    /* ���󷽷� ����� */
    public abstract double getArea();

    /* ���󷽷� ���ܳ� */
    public abstract double getPerimeter();
}

public class ketang4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int a = input.nextInt();
		DecimalFormat d = new DecimalFormat("#.####");
		RegularPolygon o1 = new RegularPolygon(n, a);
		System.out.println(d.format(o1.getArea()));
		System.out.println(d.format(o1.getPerimeter()));
			
	}
		
}
