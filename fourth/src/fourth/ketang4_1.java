package fourth;
import java.text.DecimalFormat;
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
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double a = sc.nextDouble();
        RegularPolygon regularPolygon = new RegularPolygon(n,a);
        DecimalFormat df = new DecimalFormat("#.####");
        System.out.println(df.format(regularPolygon.getArea()));
        double c = regularPolygon.getPerimeter();
        if(c == (int)c){
            df = new DecimalFormat("#");
        }
        System.out.println(df.format(c));
	}
	
}
